package com.furmi.json;

import com.furmi.model.Policy;
import com.furmi.model.Statement;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
public class JsonVerify {
    JsonReadFromFile jsonReadFromFile;

    public boolean verifyResource(String filePath) throws IOException {
        Policy policy = jsonReadFromFile.jsonFromFileToPolicyObject(filePath);
        List<Statement> statements = policy.getPolicyDocument().getStatement();
        for (Statement s : statements) {
            if (s.getResource().equals("*")) {
                return false;
            }
        }
        return true;
    }

}
