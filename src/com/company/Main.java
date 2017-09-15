package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        first();
        second("Programming is my Passioin");
        System.out.println(third());
        //Integer fourth();
        String z1 = getInput("Enter a Shape: ");
        String a1 = getInput("Enter Height: ");
        String a2 = getInput("Enter Width:  ");
        System.out.println(fourth());
        System.out.println(fifth());
        Object num1;
        //System.out.println("help", ++1);

        double result = multiplyValues(a1, a2);
        System.out.println("The Area is " + result);
    }

    public static String getInput(String prompt) {

        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double multiplyValues(String a1, String a2) {
        double b1 = Double.parseDouble(a1);
        double b2 = Double.parseDouble(a2);
        double result = b1 * b2;
        return result;
    }

    public static void first() {
        System.out.println("This_is_Erics_Method_Program");

    }

    public static void second(String second_way) {
        System.out.println(second_way);

    }

    /*public static void sixth(String name, int num1) {
        System.out.println(name, num1);


    }*/



    public static String third() {
        //System.out.println("Trapezoid, Square, Rectangle, Parallelogram");
        return "Trapezoid, Square, Rectangle, Parallelogram";

    }

    public static double fourth() {
        return 10000000;

    }



    public static String fifth() {

        return "I only made it 2 sides";
    }
}

