package com.BookMyShow.bookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
// show is by default lagnauge specif so can't create table with that name
@Table(name = "shows")
@NoArgsConstructor
@Builder(toBuilder = true)
public class Show extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private Date startTime;
    private Integer duration;

    @ManyToOne
    @JoinColumn (name = "theatre_id")
    private Theatre theatre;
   private List<ShowSeat> showSeats = new ArrayList<>();
}