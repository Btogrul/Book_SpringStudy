package com.ltc.book.service;

import com.ltc.book.dto.AuthorDTO;
import com.ltc.book.entity.Author;
import com.ltc.book.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final ModelMapper modelMapper;

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }

    public ResponseEntity<String> addAuthor(AuthorDTO newAuthor) {
        Author author = modelMapper.map(newAuthor, Author.class);
        authorRepository.save(author);
        return ResponseEntity.ok("Author added successfully");
    }

    public void delete(Long id) {
        Author author = authorRepository.findById(id).orElseThrow();
        authorRepository.delete(author);
    }

    public void update(Long id, AuthorDTO dto) {
        Author author = authorRepository.findById(id).orElseThrow();
        modelMapper.map(dto, author);
        authorRepository.save(author);
    }
}
