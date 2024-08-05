package Practice;

import java.util.Scanner;

public class ReverseString_B1 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String s=str.next();

        // conversion from String object to StringBuffer
        StringBuffer st=new StringBuffer(s);
        st.reverse();

        System.out.println(st);


    }
}
