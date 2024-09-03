package Exercise01;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number= " );
        int x=sc.nextInt();

        if(x==3){
            System.out.println("x must be 3");
        }else{
            System.out.println("X is not 3");
        }
        System.out.println("This runs no matter what");
    }
}
