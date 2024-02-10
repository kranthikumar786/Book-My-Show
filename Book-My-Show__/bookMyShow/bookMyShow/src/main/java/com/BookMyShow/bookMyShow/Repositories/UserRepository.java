package com.BookMyShow.bookMyShow.Repositories;

import com.BookMyShow.bookMyShow.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

}
