package io.junit.junit.domain;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Slf4j
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void 책등록(){
        log.info("test");
        String title = "junit";
        String author = "cod";

        Book book = Book.builder()
                .title(title)
                .author(author)
                .build();

        Book bookPS = bookRepository.save(book);

        assertEquals("junit", bookPS.getTitle());

    }

}