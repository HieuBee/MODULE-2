package com.company.exercise;

import java.util.Scanner;

public class Application_to_read_numbers_into_letters {
    public static void main(String[] args) {
        String dozens = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Input one number: ");
        int number = s.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    String number1 = "One";
                    System.out.println("Zero");
                    break;
                case 2:
                    String number2 = "Two";
                    System.out.println("Two");
                    break;
                case 3:
                    String number3 = "Three";
                    System.out.println("Three");
                    break;
                case 4:
                    String number4 = "Four";
                    System.out.println("Four");
                    break;
                case 5:
                    String number5 = "Five";
                    System.out.println("Five");
                    break;
                case 6:
                    String number6 = "Six";
                    System.out.println("Six");
                    break;
                case 7:
                    String number7 = "Seven";
                    System.out.println("Seven");
                    break;
                case 8:
                    String number8 = "Eight";
                    System.out.println("Eight");
                    break;
                case 9:
                    String number9 = "Nine";
                    System.out.println("Nine");
                    break;
            }
            System.out.println(dozens);
        } else if (number < 20 && number <= 10) {
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number < 100 && number >= 20) {
            switch (number / 10) {
                case 2:
                    dozens = "Twenty";
            }
        }
    }
}
