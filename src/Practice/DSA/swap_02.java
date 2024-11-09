package Practice.DSA;

public class swap_02 {
    public static void main(String[] args) {
        int a=10, b=22;
        System.out.println("Before swapping Value of a is " +a +" and value of b is " +b);
        a =(a+b) -(b=a);
        System.out.println("After Swapping Value of a is " +a + " and value of b is " +b);
    }
}
