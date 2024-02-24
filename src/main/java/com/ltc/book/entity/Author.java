package com.ltc.book.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Table(name = "authors")
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authorName;
    private String surname;

    @OneToMany(mappedBy = "author", cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Book> books;
}


