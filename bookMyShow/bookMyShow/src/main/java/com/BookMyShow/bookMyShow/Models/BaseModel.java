package com.BookMyShow.bookMyShow.Models;
import java.util.Date;
@MappedSuperclass
public abstract  class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;
}