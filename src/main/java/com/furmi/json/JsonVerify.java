package com.furmi.json;

import com.furmi.model.Policy;
import com.furmi.model.Statement;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
public class JsonVerify {
    JsonReadFromFile readFromFile;

    public boolean verifyResource(String filePath) throws IOException {
        Policy policy = readFromFile.jsonFromFileToPolicyObject(filePath);
        List<Statement> statement = policy.getPolicyDocument().getStatement();
        for (int i = 0; i < statement.size(); i++) {
            if (statement.get(i).getResource().equals("*")) {
                return false;
            }
        }
        return true;
    }

}
