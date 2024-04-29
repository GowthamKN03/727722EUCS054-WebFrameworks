package com.example.gowthamknday14cw2.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowthamknday14cw2.model.GowthamBook;
import com.example.gowthamknday14cw2.service.GowthamBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class GowthamBookController {
    @Autowired
    GowthamBookService bookService;

    @PostMapping("/api/book")
    public GowthamBook addBook(@RequestBody GowthamBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public GowthamBook updateBook(@PathVariable int id,@RequestBody GowthamBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<GowthamBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<GowthamBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
