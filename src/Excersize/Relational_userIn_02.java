package Excersize;

import java.util.Scanner;

public class Relational_userIn_02 {
    public static void main(String args[]){
        //initializing the variables
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1= sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2= sc.nextInt();

        System.out.println("num1 > num2: " +(num1 > num2));
        System.out.println("num1 < num2: "+(num1 < num2));
        System.out.println("num1 <= num2: "+(num1 <= num2));
        System.out.println("num1 >= num2: "+(num1 >= num2));
        System.out.println("num1 == num2: "+(num1 == num2));
        System.out.println("num1 != num2: "+(num1 != num2));




    }
}
