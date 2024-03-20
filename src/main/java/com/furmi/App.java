package com.furmi;

import com.furmi.json.JsonReadFromFile;
import com.furmi.json.JsonVerify;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String filePath = userPath();
        JsonReadFromFile readFromFile = new JsonReadFromFile();
        JsonVerify methods = new JsonVerify(readFromFile);

        System.out.println(methods.verifyResource(filePath));
    }

    static String userPath() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path from which you want to verfiy IAM Policy: ");
        return sc.nextLine();
    }
}

