package com.BookMyShow.bookMyShow.Services;

import com.BookMyShow.bookMyShow.DTOs.CreateShowRequest;
import com.BookMyShow.bookMyShow.Models.Movie;
import com.BookMyShow.bookMyShow.Models.Show;
import com.BookMyShow.bookMyShow.Models.ShowSeat;
import com.BookMyShow.bookMyShow.Repositories.ShowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ShowService {
    private ShowRepository showRepository;
    public Show createShow(CreateShowRequest request){

          // get the movie by id
         // use Movie Repository. Always from service class call service class only , Don't call other Repositories.
          Movie movie = null;
          Show show = Show.builder()
                  .startTime(request.getStartTime())
                   .duration(request.getDurationTime())
                   .movie(movie)
                   .build();

        Show savedShow = showRepository.save(show);

        /* Task 2
              Get the seats in the hall using hallId
              Create the showSeats using the savedShow
              Save the show again
        * */
        List<ShowSeat> seats = Collection.emptyList();
        return showRepository.save(savedShow.toBuilder().showSeats(seats));

    }

   public Show getShow(Long id){
        return showRepository
                .findById(id)
                .orElseThrow(()-> new NoSuchElementException("Invalid Show  Id" + id));
   }
}
