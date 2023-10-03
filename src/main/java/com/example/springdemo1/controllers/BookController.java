package com.example.springdemo1.controllers;

import com.example.springdemo1.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")

    public Book[] b(){
        Book b1=Book.builder().id(789).title("msk").isbn("uiy899").build();
        Book b2=Book.builder().id(780).title("msk1").isbn("quiy899").build();
        Book b3=Book.builder().id(7089).title("msk2").isbn("duiy899").build();
        Book [] book1={b1,b2,b3};
        return  book1;
    }
}
