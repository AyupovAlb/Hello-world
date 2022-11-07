package com.app;

import com.fasterxml.jackson.databind.JsonNode;

public class HelloWorld {
    public static void main(String[] argv) {
        JsonReader jsonReader = new ResourceJsonReader();
        JsonNode node = jsonReader.read("learn.js");
        System.out.println(node);
    }
}