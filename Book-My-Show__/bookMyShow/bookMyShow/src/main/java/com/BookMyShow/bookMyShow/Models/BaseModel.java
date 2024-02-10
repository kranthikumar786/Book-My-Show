package com.BookMyShow.bookMyShow.Models;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract  class BaseModel {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;
}