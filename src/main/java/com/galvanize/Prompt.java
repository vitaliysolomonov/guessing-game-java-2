package com.galvanize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
}


