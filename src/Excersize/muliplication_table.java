package Excersize;

import java.util.Scanner;

public class muliplication_table {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the numbers(Table to be created)");
        {
            System.out.println("Input number of terms: ");
            Scanner in=new Scanner(System.in);
            n= in.nextInt();
            System.out.println("\n");
            for(i=1; i<=5; i++){
                System.out.println(n+"X" +i + " =" +n*i);

        }
        }
    }
}
