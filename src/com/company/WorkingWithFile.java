package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFile {
    private static final String READ_PATH = "./src/com/company/Hotel.txt";
    private  String[] linesAsArray;

    public String[] getLinesAsArray() {
        return linesAsArray;
    }

    public void readFromFileByLines() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(READ_PATH));
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        linesAsArray = lines.toArray(new String[lines.size()]);

    }
}
