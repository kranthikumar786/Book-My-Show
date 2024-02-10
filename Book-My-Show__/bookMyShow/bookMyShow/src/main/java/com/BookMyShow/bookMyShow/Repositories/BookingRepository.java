package com.BookMyShow.bookMyShow.Repositories;

import com.BookMyShow.bookMyShow.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {

}
