package com.jalaldev.booksocial.exmaple2.services;

import com.jalaldev.booksocial.exmaple2.Person;
import com.jalaldev.booksocial.exmaple2.PocketBaseResponse;
import lombok.Setter;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Setter
public class PocketBaseService<T> {
    private final RestTemplate restTemplate;
    private final String pocketBaseUrl = "http://jalaldev.com:8080/api/";
    private String endPoint;

    public PocketBaseResponse<T> getAll() {
        ResponseEntity<PocketBaseResponse<T>> response = restTemplate.exchange(
                pocketBaseUrl + endPoint,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<PocketBaseResponse<T>>() {}
        );
        return response.getBody();
    }
}