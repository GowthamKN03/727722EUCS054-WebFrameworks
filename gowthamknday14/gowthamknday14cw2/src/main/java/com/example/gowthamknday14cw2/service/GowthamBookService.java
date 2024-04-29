package com.example.gowthamknday14cw2.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gowthamknday14cw2.model.GowthamBook;
import com.example.gowthamknday14cw2.repository.GowthamBookRepo;



@Service
public class GowthamBookService {
   @Autowired
   GowthamBookRepo bookRepo;

   public GowthamBook addBook(GowthamBook book)
   {
        return bookRepo.save(book);
   }

   public List<GowthamBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<GowthamBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public GowthamBook updateBook(int id,GowthamBook book)
   {                                                                                                                                                                                                                                                                                                   
        GowthamBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
