package com.nishita;

import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args) {

        System.out.println("Enter name of fruit");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        /*Traditional syntax of switch
         switch (condition){
        case "---":
            statement;
            break;
        case "---":
            statement;
            break;
        default:
            statement;

            */

        switch (fruit) {
            case "mango" -> System.out.println("King of Fruits");
            case "banana" -> System.out.println("Contains vitamins");
            case "apple" -> System.out.println("Red diamond");
            case "strawberry" -> System.out.println("Very sweet");
            default -> System.out.println("invalid input");
        }
    }
}
