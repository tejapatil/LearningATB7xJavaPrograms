package Practice.DSA;

public class swap_01 {

    // Function to swap two numbers
    // Using temporary variable
    static void swapUsingThirdVariable(int m, int n){
        //swapping the values
        int temp=m;
        m=n;
        n=temp;

        System.out.println("Value of m is " + m + "\tValue of n is " +n);
    }

    //main driver code
    public static void main(String[] args) {
        //Random integer values
        int m=9, n=5;

        // Calling above funtion to
        //reverse the numbers
        swapUsingThirdVariable(m, n);

    }
}
