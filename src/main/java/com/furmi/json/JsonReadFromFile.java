package com.furmi.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.furmi.model.Policy;

import java.io.File;
import java.io.IOException;

public class JsonReadFromFile {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public Policy jsonFromFileToPolicyObject(String filePath) throws IOException {
        File file = new File(filePath);
        return objectMapper.readValue(file, Policy.class);
    }
}
