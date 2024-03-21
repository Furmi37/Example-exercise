package com.furmi.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.furmi.model.Policy;
import com.furmi.model.PolicyDocument;
import com.furmi.model.Statement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class JsonReadFromFileTest {
    JsonReadFromFile jsonReadFromFile = new JsonReadFromFile();
    ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        objectMapper = mock(ObjectMapper.class);
    }

    @Test
    void shouldReturnPolicyWhenCallJsonReadFromFileMethod() throws IOException {
        //given
        String filePath = "src/main/resources/policy.json";
        PolicyDocument policyDocument = new PolicyDocument("2012-10-17", new ArrayList<>());
        List<String> actionList = List.of("iam:ListRoles", "iam:ListUsers");
        Statement statement = new Statement("IamListAccess", "Allow", actionList, "*");
        policyDocument.getStatement().add(statement);
        Policy policy = new Policy("root", policyDocument);
        File file = new File(filePath);

        when(objectMapper.readValue(file, Policy.class)).thenReturn(policy);
        //when
        Policy result = jsonReadFromFile.jsonFromFileToPolicyObject(filePath);
        //then
        assertEquals(policy, result);
    }

    @Test
    void shouldReturnNotEqualsPolicyWhenCallJsonReadFromFileMethod() throws IOException {
        //given
        String filePath = "src/main/resources/policy.json";

        Policy policy = new Policy();
        File file = new File(filePath);

        when(objectMapper.readValue(file, Policy.class)).thenReturn(policy);
        //when
        Policy result = jsonReadFromFile.jsonFromFileToPolicyObject(filePath);
        //then
        assertNotEquals(policy, result);
    }
}