package com.jalaldev.booksocial.exmaple2.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.io.IOException;


@Setter
@Getter
@AllArgsConstructor
public class DataLoader <T> {

    private final String textFileLocation;
    private final Class<T> data;

    public  T Load() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try (InputStream inputStream = new ClassPathResource(textFileLocation).getInputStream()) {
            return objectMapper.readValue(inputStream, this.data);
        }
    }

}
