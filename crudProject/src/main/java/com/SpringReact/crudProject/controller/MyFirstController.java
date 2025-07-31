package com.SpringReact.crudProject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MyFirstController {
  
  @GetMapping("/")
  public String getMethodName() {
      return "Hello from The First Controller";
  }
  
}
