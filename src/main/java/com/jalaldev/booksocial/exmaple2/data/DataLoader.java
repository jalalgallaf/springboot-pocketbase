package com.jalaldev.booksocial.exmaple2.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Setter
@Getter
@AllArgsConstructor
public class DataLoader {

    private String textFileLocation;

    private <T> T Load(Class <T> data){

        StringBuilder textData= new StringBuilder();

        try {
            FileReader fileReader = new FileReader(this.textFileLocation);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine())!=null){
                textData.append(line).append("\n");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            return .
        }

    }

}
