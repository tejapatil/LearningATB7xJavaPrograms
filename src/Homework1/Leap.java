package Homework1;

import java.util.Scanner;

public class Leap {
    public static void main(String args[]){
        int year;

        Scanner sc= new Scanner(System.in);
        year= sc.nextInt();

        // 1st condition check- It is century leap year
        // 2nd condition check- It is leap year and not
        //century year
        if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 != 0))){
            // Both conditions true- Print leap year
            System.out.println(year + ": Leap year");
        }
        else{
            // Any condition fails- Print Non-leap year
            System.out.println(year + " : Non - Leap Year");
        }
    }
}
