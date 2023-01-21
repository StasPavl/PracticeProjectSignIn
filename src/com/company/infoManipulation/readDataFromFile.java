package com.company.infoManipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readDataFromFile {

    public static String returnUserFromDataBase(String username) {

        String fileName = "data.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(username)) {// need to change to username in the future
                    return line;
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return "Couldnt find user with thisusername";
    }

}

