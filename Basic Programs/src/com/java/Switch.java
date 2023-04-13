package com.java;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit");
        String fruits = in.next();


        switch (fruits) {
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Banana":
                System.out.println("Calcuim");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("error");
        }

        System.out.println("Enter number btw 1-7");
        int day = in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
       /*  enhanced switch syntax
       switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            default -> System.out.println("Weekend");
        }*/


    }
 //by clicking i=on switch and pressing alt + ctrl enhanced switch syntax is created
                /* switch (fruits)
                {
                    case "Apple" -> System.out.println("Red fruit");
                    case "Banana" -> System.out.println("Calcuim");
                    case "Orange" -> System.out.println("Round fruit");
                    default -> System.out.println("error");
                }*/



}
