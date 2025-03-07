package kz.kbtu.openapi;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {
    private final Map<Long, Book> books = new HashMap<>();

    public BookRepository() {
        books.put(1L, new Book(1, "Spring in Action", "Craig Walls"));
        books.put(2L, new Book(2, "Effective Java", "Joshua Bloch"));
        books.put(3L, new Book(3, "Clean Code", "Robert C. Martin"));
        books.put(4L, new Book(4, "Design Patterns", "Erich Gamma"));
    }

    public Optional<Book> findById(long id) {
        return Optional.ofNullable(books.get(id));
    }

    public Collection<Book> getBooks() {
        return books.values();
    }

    public Page<Book> getBooks(Pageable pageable) {
        List<Book> bookList = new ArrayList<>(books.values());
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), bookList.size());
        List<Book> subList = bookList.subList(start, end);
        return new PageImpl<>(subList, pageable, bookList.size());
    }

    public Book save(Book book) {
        books.put(book.getId(), book);
        return book;
    }
}
