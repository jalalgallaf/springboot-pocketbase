package com.jalaldev.booksocial.exmaple2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String collectionId;
    private String collectionName;
    private String  created;
    private String id;
    private String name;
    private String postion;
    private String salary;
    private String updated;
}