package com.example.demo6.form;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewRegistForm {
   private Integer restaurantId;
   private String userId;
   private Date visitDate;
    private Integer rating;
    private String comment;
}