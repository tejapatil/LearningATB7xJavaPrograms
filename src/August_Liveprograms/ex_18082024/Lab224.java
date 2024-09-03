package August_Liveprograms.ex_18082024;

import java.util.Scanner;

public class Lab224 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        try {
            if(x==0){
                throw new ArithmeticException("Enter non zero number");
            }
            int a  = 10/x;
            System.out.println(a);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
