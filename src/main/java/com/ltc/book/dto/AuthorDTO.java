package com.ltc.book.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AuthorDTO {
    private String authorName;
    private String surname;
    private List<BookDto> book;
}
