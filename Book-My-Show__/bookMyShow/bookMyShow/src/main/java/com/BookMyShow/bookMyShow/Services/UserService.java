package com.BookMyShow.bookMyShow.Services;

import com.BookMyShow.bookMyShow.Models.User;
import com.BookMyShow.bookMyShow.Repositories.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    public  User createUser( User user){
        // save this user in the database
     //   User savedUser = userRepository.save(user);
        /* User savedUser = userRepository.saveAll(List.of(user));
           if we want to save list of users
          * */
        // return new User();
        // idempotent
     return userRepository.save(user);
    }

    public User getUser(Long userId) {

         return userRepository.findById(userId).orElse(null);
    }
}