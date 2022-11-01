package com.app;

import com.fasterxml.jackson.databind.JsonNode;

public interface JsonReader {
	
	JsonNode read(String path);

}
