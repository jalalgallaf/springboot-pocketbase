package com.jalaldev.booksocial.exmaple2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PocketBaseResponse<T> {
    private int page;
    private int perPage;
    private int totalItems;
    private int totalPages;
    private List<T> items;
}
