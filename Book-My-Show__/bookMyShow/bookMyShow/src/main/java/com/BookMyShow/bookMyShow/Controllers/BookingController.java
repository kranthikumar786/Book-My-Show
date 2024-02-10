package com.BookMyShow.bookMyShow.Controllers;

import com.BookMyShow.bookMyShow.DTOs.CreateBookRequest;
import com.BookMyShow.bookMyShow.Models.Booking;
import com.BookMyShow.bookMyShow.Services.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookingController {

      private BookingService bookingService;
    // Create A booking
    @PostMapping("/booking")
   public Booking createBooking( @RequestBody CreateBookRequest request){
      return bookingService.createBooking(request);
   }
}
