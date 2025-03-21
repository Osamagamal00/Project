package Utilities;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {


    private String filePath;

    // Constructor to initialize the file path
    public JsonReader(String fileName) {
        this.filePath = "src/test/resources/TestData/" + fileName;
    }

    // Method to read the value associated with a key from the JSON file
    public String readDataFromJson(String key) {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File(filePath);

        try {
            // Parse the JSON file into a JsonNode
            JsonNode jsonData = objectMapper.readTree(jsonFile);

            // Access the field by key and return it as a String
            JsonNode valueNode = jsonData.path(key);
            if (!valueNode.isMissingNode()) {
                // If the key exists, return the value as a string
                return valueNode.asText();
            } else {
                // If the key doesn't exist, return null
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
