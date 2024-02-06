package com.BookMyShow.bookMyShow.Models;
@Getter
@Setter
@Entity
public class Payment extends BaseModel{

   private String reference;
   private Double amount;
   @Enumarated
    private PaymentMethodType providerType;
   @Enumarated
    private PaymentStatus status;

}