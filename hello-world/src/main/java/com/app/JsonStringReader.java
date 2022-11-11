package com.app;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringReader implements JsonReader {

	@Override
	public JsonNode read(String json) {
		 ObjectMapper om = new ObjectMapper();
	        try {
	            return om.readTree(json);
	        } catch (Exception ex){
	            throw new RuntimeException(ex);
	        }
	}

}
