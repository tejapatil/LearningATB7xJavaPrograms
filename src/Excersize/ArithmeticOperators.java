package Excersize;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 =sc.nextDouble();

        System.out.println("Enter the second number");
        double num2 =sc.nextDouble();

        double sum= num1+num2;
        double difference= num1-num2;
        double product= num1*num2;
        double quotient = num1/num2;
        double reminder = num1%num2;

        System.out.println("The sum of the number is " +sum);
        System.out.println("The difference of the number is " +difference);
        System.out.println("The product of the number is "+product);
        System.out.println("The quotient of the number is "+quotient);
        System.out.println("The reminder of the number is "+reminder);

    }
}
