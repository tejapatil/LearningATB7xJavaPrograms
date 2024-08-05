package ex_22072024;

import java.util.Scanner;

public class Lab151 {
    public static void main(String[] args) {
        //String -Bunch of Chars.
        //
     //   String s1=new String("Tejaswini");
       // String s2="Tejaswini";//String constant pool

        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String s2=s1.concat("Hatti");

        //String -Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2);

        StringBuffer sb=new StringBuffer("Tejaswini");
        sb.append(" Patil");
        System.out.println(sb.toString());

    }
}
