package com.techreturners.bookmanager.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Long id){
        super ("The id entered (" + id + ") does not exist.  Please try another id.");
    }
}
