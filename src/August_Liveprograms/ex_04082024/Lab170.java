package August_Liveprograms.ex_04082024;

import java.util.Scanner;

public class Lab170 {
    public static void main(String[] args) {
        BankAccount ba1=new BankAccount();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank cODE!");
        String bCode= sc.next();

        BankAccount baicici=new BankAccount(bName, bal, bCode);

        baicici.printDetails();
    }
}
