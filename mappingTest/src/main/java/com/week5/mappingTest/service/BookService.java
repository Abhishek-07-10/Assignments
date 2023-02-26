package com.week5.mappingTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.week5.mappingTest.model.Book;
import com.week5.mappingTest.repository.BookRepo;

@Service
public class BookService {

    @Autowired
    BookRepo repo;

    public void addBook(Book book) {
        repo.save(book);
    }
    
    public List<Book> getAllBooks(){
        return repo.findAll();
    }

    public Book getBookById(String id){
        return repo.findById(id).get();
    }

    public String deleteBookById(String id){
        repo.deleteById(id);
        return "Deleted book having ID: "+ id;
    }

    public String updateBook(Book book, String id){
        if(repo.findById(id).isPresent()){
            Book newBook = repo.findById(id).get();
            newBook.setAuthor(book.getAuthor());
            newBook.setTitle(book.getTitle());
            newBook.setPrice(book.getPrice());
            newBook.setStudent(book.getStudent());
            newBook.setDescription(book.getDescription());
            repo.save(newBook);
            return "Updated successfully";
        }
        return "ID not found in datebase";
    }
    
}
