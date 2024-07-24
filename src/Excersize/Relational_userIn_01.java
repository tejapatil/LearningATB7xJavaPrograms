package Excersize;

import java.util.Scanner;

public class Relational_userIn_01 {
    public static void main(String args[])
    {
        // Initializing variables
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number1");
        int var1= sc.nextInt();

        System.out.println("Enter the number2");
        int var2= sc.nextInt();

        System.out.println("Enter the number3");
        int var3= sc.nextInt();

      //  int var1 = 5, var2 = 10, var3 = 5;

        //Displaying var1, var2, var3
        System.out.println("var1= " + var1);
        System.out.println("var2= " + var2);
        System.out.println("var3= " + var3);

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("var1 == var2: "+(var1 == var2));

        //comparing var1 and var3 and
        // printing corresponding boolean value
        System.out.println("var1 == var3: "+(var1 == var3));

        //comparing var2 and var3 and
        //printing corresponding boolean value
        System.out.println("var2 == var3: "+(var2 == var3));
    }
}

