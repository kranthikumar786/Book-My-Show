package com.BookMyShow.bookMyShow.DTOs;
import lombok.Data;

import java.util.Date;

public class CreateShowRequest {
    private Long hallId;
    private Long movieId;
    private Date startTime;
    private Integer duration;
}
