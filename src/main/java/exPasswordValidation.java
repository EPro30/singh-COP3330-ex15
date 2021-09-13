/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exPasswordValidation {
    public static void main (String[] args)
    {
        final String password = "abc$123";
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the username? ");
        String uId = sc.nextLine();
        System.out.println("What is the password? ");
        String pswrd = sc.nextLine();

        if(password.compareTo(pswrd) == 0) //String1.compareTo(String2) returns 0 if all the characters are the same
        {
            System.out.println("Welcome!"); //If all the characters are the same then print this statement
        }
        else
        {
            System.out.println("I don't know you."); //If any character is different or any letter is capitalized then print this statement
        }
    }
}
