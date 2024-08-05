package Excersize;

import java.util.Scanner;

public class factorial_while {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int value=sc.nextInt();
        int factorial=1;
        int temp=value;
        while(temp > 2){
             factorial *= temp--;
        }
        System.out.println(value +"! = "+factorial);
    }
}
