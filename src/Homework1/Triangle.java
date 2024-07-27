package Homework1;

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        // Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the sides of Triangle");

            System.out.println("Enter the first side of Triangle");
            int a = sc.nextInt();
            System.out.println("Enter the second side of Triangle");
            int b = sc.nextInt();
            System.out.println("Enter the third side of Triangle");
            int c = sc.nextInt();

            if (a == b && b == c && c == a) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else if ((a != b) && (b == c) || (a != c) && (b == c)) {
                System.out.println("Scalene Triangle");
            }
        }
    }

