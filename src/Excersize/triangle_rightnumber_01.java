package Excersize;

import java.util.Scanner;

public class triangle_rightnumber_01 {
    public static void main(String[] args) {
        int i,j,n,k=1   ;
        System.out.println("Input number of rows : ");

        Scanner in=new Scanner(System.in);
        n=in.nextInt();

        for(i=1; i<=n; i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(k++);
                System.out.println("");
        }
    }
}
