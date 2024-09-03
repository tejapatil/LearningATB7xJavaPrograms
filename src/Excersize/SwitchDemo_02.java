package Excersize;


import java.util.Scanner;

public class SwitchDemo_02 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter age");
    int age=sc.nextInt();
    switch (age) {
        case 10:
        case 15:
        case 17:
            System.out.println("You are not eligible for voting");
            break;
        case 18:
            System.out.println("You are eligible for voting");
            break;
        default:
            System.out.println("Lol");
    }
       sc.close();
    }

}
