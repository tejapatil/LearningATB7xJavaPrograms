package Excersize;

import java.util.Scanner;

public class whileLoopNegativeCondition {
    public static void main(String[] args) {
        int counter;
        Scanner inputDevice =new Scanner(System.in);
        System.out.print("Please enter loop counter value >> ");
        counter=inputDevice.nextInt();
        System.out.println("Before loop");
        while(counter < 5){
            System.out.println("Inside Loop - Counter " + counter);
            counter++;
        }
        System.out.println("After while loop");
    }
}
