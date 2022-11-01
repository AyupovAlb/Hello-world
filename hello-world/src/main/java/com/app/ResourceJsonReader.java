package com.app;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResourceJsonReader implements JsonReader {

	@Override
	public JsonNode read(String path) {
		ObjectMapper om = new ObjectMapper();
		try {
			return om.readTree(getClass().getResourceAsStream(path));
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}		
	}

}
