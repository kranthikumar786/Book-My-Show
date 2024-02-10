package com.BookMyShow.bookMyShow.Models;
@Entity
public class User extends BaseModel {
  private String email;
  private String name;
  private String password;

 public User(Stirng name , Stirng email,Stirng password){
   this.name = name;
   this.email = email;
   this.password = password;
 }
}