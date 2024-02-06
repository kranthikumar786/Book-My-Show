package com.BookMyShow.bookMyShow.Models;

@Getter
@Setter
@Entity
// by default
public class Booking extends BaseModel{

    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @ManyToMany
    private List<ShowSeat> seats = new ArrayList<>();

    private Double amount;
    private Date bookedAt;
    @Enumarated
    private BookingStatus status;
    @OneToMany
    private List<Payment> payments = new ArrayList<>();
}