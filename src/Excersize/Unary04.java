package Excersize;

import java.util.Scanner;

public class Unary04 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // for user inputs here is the code.
        //System.out.println("Enter a number: ");
        //int num= sc.nextInt();
        int num= 10;

        int result = +num;
        System.out.println("The value of result after unary plus is " + result);

        result = -num;
        System.out.println("The value of result after unary minus is " +result);

        result= ++num;
        System.out.println("The value of result after pre-increment is " +result);

        result= num++;
        System.out.println("The value of result after post-increment is " +result);

        result= --num;
        System.out.println("The value of result after post-decrement is " +result);

        result= num--;
        System.out.println("The value of result after pre-decrement is " +result);


    }
}
