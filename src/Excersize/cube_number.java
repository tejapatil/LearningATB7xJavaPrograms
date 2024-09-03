package Excersize;

import java.util.Scanner;

public class cube_number {
    public static void main(String[] args) {
        int i, n;

        System.out.println("Input number of terms");
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        for(i=1; i<=n; i++){
            System.out.println("Number is: "+i+ "cube of" +i+"is : " + (i*i*i));
        }
    }
}
