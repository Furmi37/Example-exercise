package com.furmi.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.furmi.model.Policy;

import java.io.File;
import java.io.IOException;

public class JsonReadFromFile {
    public Policy jsonFromFileToPolicyObject(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File policyJsonFile = new File(filePath);
        return objectMapper.readValue(policyJsonFile, Policy.class);
    }
}
