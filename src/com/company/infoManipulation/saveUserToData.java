package com.company.infoManipulation;

import com.company.User;

import java.io.*;

public class saveUserToData {
    public static void saveToFile(User user, String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            boolean isWordPresent = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(user.getUsername())) {
                    isWordPresent = true;
                    break;
                }
            }
            bufferedReader.close();
            if (isWordPresent) {
                System.out.println("Sorry, username already taken!");
            } else {

                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(user.getUsername());
                bufferedWriter.write(",");
                bufferedWriter.write(user.getPassword());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}





