
package com.example.MVC2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping(value = {"","/","/hello"})
public String message() {
  return "Hello, World!";
}
}
