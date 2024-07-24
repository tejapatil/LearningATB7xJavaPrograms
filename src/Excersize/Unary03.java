package Excersize;

public class Unary03 {
    public static void main(String args[]){
        //Declaring a variable
        int n1= 7, n2= -8;
        //Printing numbers on console
        System.out.println("First number = " +n1);
        System.out.println("Second number =" +n2);

        //Printing numbers on console after
        //performing bitwise complement
        System.out.println(n1 + "'s bitwise complement = " + ~n1);
        System.out.println(n2 +"'s bitwise complement =" + ~n2);
    }
}
