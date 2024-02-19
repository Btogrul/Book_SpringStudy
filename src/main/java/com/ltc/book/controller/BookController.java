package com.ltc.book.controller;

import com.ltc.book.dto.BookDto;
import com.ltc.book.service.BookService_2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService_2 bookService;


    @GetMapping("/all")
    public void getAllBooks() {
        bookService.getAll();

    }


    @GetMapping("/id")
    public void getBookById(@RequestParam Long id) {
        bookService.findById(id);
    }


    @PostMapping
    public ArrayList<BookDto> addBook(@RequestBody BookDto newBook) {
        return bookService.addBook(newBook);
    }


    @PutMapping
    public void updateBook(@RequestParam Long id, @RequestBody BookDto updatedBook) {
        bookService.update(id, updatedBook);
    }


    @DeleteMapping
    public void deleteBook(@RequestParam Long id) {
        bookService.delete(id);
    }

}
