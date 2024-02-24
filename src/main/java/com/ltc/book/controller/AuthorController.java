package com.ltc.book.controller;

import com.ltc.book.dto.AuthorDTO;
import com.ltc.book.entity.Author;
import com.ltc.book.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;
    private final ModelMapper modelMapper;

    @GetMapping("/all")
    public List<Author> getAllAuthors() {
        return authorService.getAll();
    }

    @GetMapping("/id")
    public Author getAuthorById(@RequestParam Long id) {
        return authorService.findById(id);
    }

    @PostMapping
    public ResponseEntity<String> addAuthor(@RequestBody AuthorDTO newAuthor) {
        authorService.addAuthor(newAuthor);
        return ResponseEntity.ok("Author added successfully");
    }

    @PutMapping
    public void updateAuthor(@RequestParam Long id, @RequestBody AuthorDTO updatedAuthor) {
        authorService.update(id, updatedAuthor);
    }

    @DeleteMapping
    public void deleteAuthor(@RequestParam Long id) {
        authorService.delete(id);
    }
}