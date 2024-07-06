package com.jalaldev.booksocial.exmaple2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String id;
    String name;
    String postion;
    String salary;
    @JsonProperty("created")
    String createdAT;
    @JsonProperty("update")
    String updatedAT;
}
