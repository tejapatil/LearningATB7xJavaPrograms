package July_Liveprograms.ex_14072024;

public class Lab056 {
    public static void main(String args[]){
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        //widening
        byte b= 10;
        int a=b; //VALID -Implicit Casting -JVM
        int a1= (int)b; //Explicit Casting
        System.out.println(a1);

        //Narrowing
        int val=300;
        //byte b1= val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);
    }
}
