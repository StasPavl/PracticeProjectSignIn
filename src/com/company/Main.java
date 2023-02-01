package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Online shop. \nFor Sigh IN press: 1\nFor Sing Up press: 2\nFor exit our shop press: 0");

        Scanner scanner = new Scanner(System.in);

        int decision = scanner.nextInt();


        switch (decision){
            case 1:
                //signInWithUserName();
                break;
            case 2:
               GenerationMethods.createUser();

                break;
            case 0:
                break;
        }
    }
}
