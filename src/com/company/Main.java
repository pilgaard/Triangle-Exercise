package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner;

    public static void main(String[] args) {
        getInput();
    }

    public static void getInput(){
        scanner = new Scanner(System.in);
        System.out.println("Enter 3 lengths separated by a space");
        Triangle triangle = new Triangle();
        try {
            triangle.setA(scanner.nextInt());
            triangle.setB(scanner.nextInt());
            triangle.setC(scanner.nextInt());
            System.out.println(triangle);
            if (triangle.isValid()){
                System.out.println(triangle.checkSides());
                tryAgain();
            } else {
                System.out.println("It's an invalid triangle");
                tryAgain();
            }
        } catch (Exception e){
            System.out.println("It's an invalid triangle");
            getInput();
        }
    }

    public static void tryAgain(){
        System.out.println("If you will try again press \"y\"");
        System.out.println("Else press any other key");
        String answer = scanner.next();
        if (answer.equals("y"))  {
            getInput();
        }
    }
}
