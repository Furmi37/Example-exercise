package com.furmi;

import com.furmi.json.JsonReadFromFile;
import com.furmi.json.JsonVerify;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String filePath = userPath();
        JsonReadFromFile jsonReadFromFile = new JsonReadFromFile();
        JsonVerify jsonVerify = new JsonVerify(jsonReadFromFile);

        System.out.println(jsonVerify.verifyResource(filePath));
    }

    static String userPath() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path from which you want to verfiy IAM Policy: ");
        return sc.nextLine();
    }
}

