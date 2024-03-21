package com.furmi.json;

import com.furmi.model.Policy;
import com.furmi.model.PolicyDocument;
import com.furmi.model.Statement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class JsonVerifyTest {
    JsonVerify jsonVerify;
    JsonReadFromFile readFromFile;

    @BeforeEach
    void setUp() {
        readFromFile = mock(JsonReadFromFile.class);
        jsonVerify = new JsonVerify(readFromFile);
    }

    @Test
    void shouldReturnFalseWhenVerifyResource() throws IOException {
        //given
        String filePath = "src/main/resources/policy.json";
        PolicyDocument policyDocument = new PolicyDocument("2012-10-17", new ArrayList<>());
        List<String> actionList = List.of("iam:ListRoles", "iam:ListUsers");
        Statement statement = new Statement("IamListAccess", "Allow", actionList, "*");
        policyDocument.getStatement().add(statement);
        Policy policy = new Policy("root", policyDocument);

        when(readFromFile.jsonFromFileToPolicyObject(filePath)).thenReturn(policy);
        //when
        boolean result = jsonVerify.verifyResource(filePath);
        //then
        assertFalse(result);
        verify(readFromFile, times(1)).jsonFromFileToPolicyObject(filePath);
    }

    @Test
    void shouldReturnTrueWhenVerifyResource() throws IOException {
        //given
        String filePath = "src/main/resources/policy.json";
        PolicyDocument policyDocument = new PolicyDocument("2012-10-17", new ArrayList<>());
        List<String> actionList = List.of("iam:ListRoles", "iam:ListUsers");
        Statement statement = new Statement("IamListAccess", "Allow", actionList, "arn:aws:s3:::bucket-name/*");
        policyDocument.getStatement().add(statement);
        Policy policy = new Policy("root", policyDocument);

        when(readFromFile.jsonFromFileToPolicyObject(filePath)).thenReturn(policy);
        //when
        boolean result = jsonVerify.verifyResource(filePath);
        //then
        assertTrue(result);
        verify(readFromFile, times(1)).jsonFromFileToPolicyObject(filePath);
    }
}