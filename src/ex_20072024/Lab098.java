package ex_20072024;

import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        int itemcode= 001;
        //Scanner sc=new Scanner(System.in);
        //int itemcode =sc.nextInt();
        switch(itemcode){
            case 001 -> System.out.println("Its a Laptop");
            case 002 -> System.out.println("its a Desktop");
            case 003, 004 -> System.out.println("Its a Mobile phone");
            default -> System.out.println("Hello");
        }
    }
}
