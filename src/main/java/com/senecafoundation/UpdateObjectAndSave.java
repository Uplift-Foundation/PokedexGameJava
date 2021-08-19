package com.senecafoundation;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.json.JsonWriter;

public class App  {
    public static void main(String[] args) throws Exception {
        try(FileReader fr = new FileReader("jsondata1.txt");
            FileWriter fw = new FileWriter("jsondata3.txt");
            JsonReader reader = Json.createReader(fr);
            JsonWriter jsonWriter = Json.createWriter(fw);) {
                JsonObject jsonObject = reader.readObject();

                JsonBuilderFactory jsonBuilderFactory = Json.createBuilderFactory(null);
                JsonObjectBuilder jsonObjectBuilder = jsonBuilderFactory.createObjectBuilder();

                for(String color : jsonObject.color()) {
                    jsonObjectBuilder.add(color, jsonObject.get(color));
                }
                jsonObjectBuilder.add("color","size");

                jsonObject = jsonObjectBuilder.build();

                jsonWriter.writeObject(jsonObject);
        }
    }
}