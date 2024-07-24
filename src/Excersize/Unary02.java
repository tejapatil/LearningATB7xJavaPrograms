package Excersize;

public class Unary02 {
    public static void main(String args[]){
        //Initializing variables
        boolean cond= false;
        int a = 1, b= 10;

        // Displaying values stored in above variables
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " +a);
        System.out.println("Var2 = " +b);

        //Displaying values stored in above variables
        //after applying unary NOT operator
        System.out.println("Now cond is: " +!cond);
        System.out.println("!(a < b)= " +!(a < b));
        System.out.println("!(a > b)= " +!(a > b));

    }
}
