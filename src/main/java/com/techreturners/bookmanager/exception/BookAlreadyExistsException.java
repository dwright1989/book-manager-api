package com.techreturners.bookmanager.exception;

public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(Long id){
        super ("A book with the id: " + id + " already exists.");
    }
}
