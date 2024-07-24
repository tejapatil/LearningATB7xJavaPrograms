package ex_14072024;

public class Lab067 {
    public static void main(String args[]){
        String name= "Pramod";
        //String?- //Bunch of Chars -collection of chars
        //class -?
        String name2= new String("Pramod");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // String constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); // Exception Index 10 out of bounds

    }
}
