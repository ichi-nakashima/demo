package com.ichi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    // HTTP リクエストを受け付けるメソッドであることを示す
    @RequestMapping("/")
    String Index() {
        return "Hello World";
    }

    @RequestMapping("/hoge")
    String hoge() {
        return "aaaa";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
