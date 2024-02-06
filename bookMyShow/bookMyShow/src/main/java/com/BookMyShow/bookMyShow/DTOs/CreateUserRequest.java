package com.BookMyShow.bookMyShow.DTOs;

@Data
public class CreateUserRequest {
    private String email;
    private String name;
    private String password;
    public User toUser(){
        return new User(name,email,password);
    }
}