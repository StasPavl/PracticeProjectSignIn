package com.company;

import java.util.Scanner;

import static com.company.infoManipulation.saveUserToData.saveToFile;

public class GenerationMethods {
    public static void createUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = scanner.nextLine();
        System.out.println("Enter your password");
        String password = scanner.nextLine();

        User user = new User(username,password);


        saveToFile(user,"data.csv");


    }

}

