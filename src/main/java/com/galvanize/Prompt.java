package com.galvanize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

public class Prompt {
    public static Integer present() {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = is.readLine();
            return Integer.parseInt(inputString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String presentName() {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            String readLine = is.readLine();
            return readLine;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}

