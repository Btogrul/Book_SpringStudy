package com.ltc.book.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name = "books")
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String bookName;
        private String isbn;

        @Column(name = "publication_year")
        private Integer publicationYear;

        @Column(name = "count_of_page")
        private Integer countOfPage;

        @ManyToOne
        @JoinColumn(name = "author_id")
        private Author author;


}
