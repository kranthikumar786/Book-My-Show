package com.BookMyShow.bookMyShow.DTOs;
@Data
public class GetUserResponse {
 private Long id;
    private String name;
 private String email;

public GetUserResponse fromUser (User user) {
    return new GetUserResponse(user.getId(),user.getName(),user.getEmail());
}
}