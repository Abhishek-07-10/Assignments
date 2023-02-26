package com.week5.mappingTest.control;

import java.util.List;
import java.util.UUID;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.week5.mappingTest.model.Book;
import com.week5.mappingTest.repository.StudentRepo;
import com.week5.mappingTest.service.BookService;

@RestController
@RequestMapping("/book")
public class BookControl {

    @Autowired
    BookService service;

    @Autowired
    StudentRepo sRepo;

    @PostMapping("/addBook")
    public void addBook(@RequestBody String book) {
        Book book1 = setBook(book);
        service.addBook(book1);
    }

    private Book setBook(String book) {
        JSONObject json = new JSONObject(book);
        Book newBook = new Book();
        newBook.setAuthor(json.getString("author"));
        String Id = UUID.randomUUID().toString();
        newBook.setID(Id);
        newBook.setDescription(json.getString("description"));
        newBook.setPrice(json.getString("price"));
        newBook.setTitle(json.getString("title"));
        String stuid = json.getString("studentid");
        newBook.setStudent(sRepo.findById(stuid).get());
        return newBook;

    }

    @DeleteMapping("/delete/books/{id}")
    public String deleteBookById(@PathVariable String id) {
        return service.deleteBookById(id);
    }

    @GetMapping("/getbooks")
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/getbooks/{id}")
    public Book getBookById(@PathVariable String id) {
        return service.getBookById(id);
    }

    @PutMapping("/update/book/{id}")
    public String updateBook(@RequestBody Book book, @PathVariable String id){
        return service.updateBook(book, id);
    }
}
