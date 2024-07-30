package ex_20072024;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        //JDK >13
        Scanner sc=new Scanner(System.in);
        //int code=
        char code= sc.next().charAt(0);
        int val = switch (code) {
            case 'A':
                yield 65;
            case 'B':
                yield 66; ////return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);

        }
    }
