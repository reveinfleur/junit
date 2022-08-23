package io.junit.junit.web.dto;

import io.junit.junit.domain.Book;
import lombok.Setter;

@Setter
public class BookSaveReqDto {
    private String title;
    private String author;

    public Book toEntity(){
        return Book.builder()
                .title(title)
                .author(author)
                .build();
    }
}
