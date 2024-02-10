package com.BookMyShow.bookMyShow.Models;
@Getter
@Setter
@Entity
public class Seat extends BaseModel{

    private Integer rowNo;
    private Integer columnNo;
    @Enumerated
    private SeatType seatType;

}

