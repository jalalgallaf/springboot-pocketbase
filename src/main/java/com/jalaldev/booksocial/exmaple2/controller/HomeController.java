package com.jalaldev.booksocial.exmaple2.controller;

import com.jalaldev.booksocial.exmaple2.Books;
import com.jalaldev.booksocial.exmaple2.PocketBaseResponse;
import com.jalaldev.booksocial.exmaple2.services.PocketBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final PocketBaseService pocketBaseService;

    @GetMapping("/")
    public ResponseEntity<PocketBaseResponse<Books>> getAll(){
        pocketBaseService.setEndPoint("collections/Books/records");
        return ResponseEntity.ok(pocketBaseService.getAll());
    }
}
