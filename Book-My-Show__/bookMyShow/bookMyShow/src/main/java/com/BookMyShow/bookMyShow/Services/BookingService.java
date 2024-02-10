package com.BookMyShow.bookMyShow.Services;

import com.BookMyShow.bookMyShow.DTOs.CreateBookRequest;
import com.BookMyShow.bookMyShow.Enums.BookingStatus;
import com.BookMyShow.bookMyShow.Models.Booking;
import com.BookMyShow.bookMyShow.Models.Show;
import com.BookMyShow.bookMyShow.Models.ShowSeat;
import com.BookMyShow.bookMyShow.Models.User;
import com.BookMyShow.bookMyShow.Repositories.BookingRepository;
import com.BookMyShow.bookMyShow.Repositories.ShowSeatRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.security.InvalidParameterException;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@Service

public class BookingService {

    private BookingRepository bookingRepository;
    private UserService userService;
    private ShowService showService;
    private ShowSeatRepository showSeatRepository


    @Transactional(isolation = Isolation.SERIALIZABLE)
     /*  Since Code be used in Distributed System  we have to lock Database not only the seat.getStatus() != SeatStatus.AVAILABLE */
    public Booking createBooking(CreateBookRequest request) {
       /*
       *   Step -1 : Get the user through ID
       *      step 1b) If the user not found, throw an error.
       */
         User user = userService.getUser(request.getUserId());
          if(user == null) {
              throw new NoSuchElementException("Invalid User Id" + request.getUserId())
          }

         /*    step 2 : Get show using show id
       *         step 2b) If show is not present ,throw an error.
       */
         Show show = showService.getShow(request.getShowId());


        /*
       *   Step 3: Get the show seats  using showSeat Ids
       */
        List<ShowSeat> showSeats = showSeatRepository.findAllById(request.getShowSeatId());

           for(ShowSeat seat : showSeats){
               if(seat.getStatus() != SeatStatus.AVAILABLE) {
                    throw new InvalidParameterException("Seat is not available");
               }
           }


       /*    Step 4 : If all the seats are available
       *
       *   Step 5 : Mark all the seats blocked
       */

        for(ShowSeat seat : showSeats) {
            seat.setStatus(SeatStatus.LOCKED);
        }

          List<ShowSeat> savedSeats = showSeatRepository.saveAll(showSeats);


  /*
   step 6 : Calculate the amount
     I can have multple ways of calucing an amount
      Which Design pattren should i use ?
     Strategy - PrincipleCalcualtorStrategy
  */

          Double amount = null;

       /*    step 7 : create and save the booking
       * */

          Booking booking = Booking.builder()
                           .user(user)
                            .show(show)
                            .seats(showSeats)
                            .amount(amount)
                            .status(BookingStatus.PENDING)
                            .bookedAt(new Date())
                             .build();

       return bookingRepository.save(booking);
    }

}
