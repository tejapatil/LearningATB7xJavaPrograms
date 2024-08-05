package Excersize;

import java.util.Scanner;

public class NestedIf_02 {
    public static void main(String[] args) {
    //int n=24;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();


    //if else condition to check whether the number is even or odd
    if(n %2==0) {
        //the number is even
        System.out.println("Even");
        //nested if else condition to check if n is divisible by 6 or not

        if(n%6 == 0){
            System.out.println("and is divisible by 6");
        }
    }else{
        if (n%3==0){
            System.out.println("and is divisible by 3");
        }else{
            System.out.println("and is not divisible by 3");
        }

    }
    }

}
