package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

  @Value("${data.name}")
  private String dataName;

  @Autowired
  private RedisTemplate<String, Object> redisTemplate;

  @GetMapping("")
  public String helloRealUser() {
    redisTemplate.opsForValue().set(
        "RT:" + 1L,
        "hihihi"
    );
    return "hello : " + dataName;
  }

}
