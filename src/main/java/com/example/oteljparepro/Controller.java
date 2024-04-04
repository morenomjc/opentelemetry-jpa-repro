package com.example.oteljparepro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final Repo repo;

  @Autowired
  Controller(Repo repo) {
    this.repo = repo;
  }

  @GetMapping("/ping")
  public String ping() throws InterruptedException {
    repo.findByName("test");
    return "pong";
  }

}
