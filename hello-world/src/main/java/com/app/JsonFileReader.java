package com.app;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JsonFileReader implements JsonReader{
    @Override
    public JsonNode read(String path) {
        File initialFile = new File(path);
        ObjectMapper om = new ObjectMapper();
        try {
            InputStream targetStream = new FileInputStream(initialFile);
            return om.readTree(targetStream);
        } catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
