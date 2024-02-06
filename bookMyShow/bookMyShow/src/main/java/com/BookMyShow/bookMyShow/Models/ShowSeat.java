package com.BookMyShow.bookMyShow.Models;
@Getter
@Setter
@Entity
 // by default show_seat = > sneak case convrsion
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumareted
    private seatStatus status;
}