package com.example.demo;

import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {
   private String message;
   private List<String> errorList;
   private int statusCode;
}
