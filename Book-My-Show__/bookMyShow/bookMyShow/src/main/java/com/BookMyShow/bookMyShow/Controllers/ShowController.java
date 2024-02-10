package com.BookMyShow.bookMyShow.Controllers;

import com.BookMyShow.bookMyShow.DTOs.CreateShowRequest;
import com.BookMyShow.bookMyShow.Models.Show;
import com.BookMyShow.bookMyShow.Services.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BookMyShow.bookMyShow.Services.ShowService;
@RestController
@AllArgsConstructor
public class ShowController {

      private ShowService showService;
     // Read API for show
    // create  show api
     @GetMapping("/show/{id});
    public Show readShow(@PathVariable Long id){
        return ShowService.getShow(id);
    }


    @PostMapping("/show")
    public Show createShoW(CreateShowRequest request) {
         return showService.createShow(request);
    }
}
