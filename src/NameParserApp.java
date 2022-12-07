/*
Author: Buzzy Moore
Date:   11/22/2022
Purpose: This program prints an entered name.
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        name = name.trim(); // removes spaces from beginning and end of string
        
        int index1 = name.indexOf(" ");
        if (index1 == -1) { // -1 is value returned if no string is found
            System.out.println("Name not in valid format.");
        }
        else {
            // if there are two words, they are first and last name
            int index2 = name.indexOf(" ", index1 + 1);
            if (index2 == -1) {
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name:  " + lastName);
            }
            else {
                // if there are three words, they are first, middle, and last name
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                    
                    System.out.println("First name:  " + firstName);
                    System.out.println("Middle name: " + middleName);
                    System.out.println("Last name:   " + lastName);
                }
                else {
                    System.out.println("Name is not in valid format.");
                }
            }
        }
        
    }
}
