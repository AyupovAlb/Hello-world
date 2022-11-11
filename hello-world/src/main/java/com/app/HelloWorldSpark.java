package com.app;

import static spark.Spark.*;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;

public class HelloWorldSpark {
	public static void main(String[] args) {
		String jsonDir = System.getenv().get("json.dir");

		get("/learn/init", (req, res) -> {
			try {
				JsonReader reader = new JsonFileReader();
				return reader.read(jsonDir + File.separator + "init" + File.separator + "init.json").toString();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw ex;
			}
		});

		get("/learn/load", (req, res) -> {
			try {
				JsonReader reader = new JsonFileReader();
				return reader.read(jsonDir + File.separator + "load" + File.separator + "load.json").toString();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw ex;
			}
		});

		post("/learn/save", (req, res) -> {
			try {
				
				JsonStringReader reader = new JsonStringReader();
				JsonNode node = reader.read(req.body());
				res.type("application/json");
				return node.toString();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw ex;
			}
		});

	}
}
