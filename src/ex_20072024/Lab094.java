package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String args[]){
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch(user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }
        switch(user_input){
            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");
        }
    }
}
