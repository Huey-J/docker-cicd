package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

  @Value("${data.name}")
  private String dataName;

  @GetMapping("")
  public String helloRealUser() {
    return "develop hello : " + dataName;
  }

}
