package com.app;

import com.fasterxml.jackson.databind.JsonNode;

public class HelloWorld {

	public void read2(String resource) {
		if (resource == null) {
			throw new NullPointerException("Resource cannot be null");
		}
		JsonReader jsonReader = new ResourceJsonReader();
		JsonNode node = jsonReader.read(resource);
		System.out.println(node);
	}

	public void read() {
		JsonReader jsonReader = new ResourceJsonReader();
		JsonNode node = jsonReader.read("learn1.js");
		System.out.println(node);
	}

	public static void main(String[] argv) {
		// new HelloWorld().read();
		try {
			new HelloWorld().read();
		} catch (Throwable  ex) {
			System.out.println(ex.getMessage());
		}
	}
}