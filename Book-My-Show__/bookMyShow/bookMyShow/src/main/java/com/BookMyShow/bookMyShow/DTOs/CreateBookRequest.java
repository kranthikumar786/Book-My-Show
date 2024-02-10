package com.BookMyShow.bookMyShow.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class CreateBookRequest {
  private Long userId;
  private Long showId;
  private List<Long> showSeatId;


}
