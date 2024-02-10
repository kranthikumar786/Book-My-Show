package com.BookMyShow.bookMyShow.Models;

import com.BookMyShow.bookMyShow.Enums.BookingStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
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