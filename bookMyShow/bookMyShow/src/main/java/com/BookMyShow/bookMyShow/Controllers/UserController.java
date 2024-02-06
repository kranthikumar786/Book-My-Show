package com.BookMyShow.bookMyShow.Controllers;
import com.BookMyShow.bookMyShow.DTOS.CreateUserDto;
import com.BookMyShow.bookMyShow.exceptions.InvalidEmailException;
import com.BookMyShow.bookMyShow.Models.User;
import com.BookMyShow.bookMyShow.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;
     //@RequestMapping(path = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public GetUserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
        User user = userService.createUser(request.toUser());
        return GetUserResponse.fromUser(user);
    }
}
