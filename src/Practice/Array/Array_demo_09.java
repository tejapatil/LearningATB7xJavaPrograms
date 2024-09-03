package Practice.Array;

import java.util.Scanner;

public class Array_demo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create an array to store the numbers
        int[] numbers = new int[100];
        int size = 0;

        // read the numbers from the user
        int n;
        do {
            n = scanner.nextInt();
            if (n >= 0) {
                numbers[size] = n;
                size++;
            }
        } while (n >= 0);

        // find the highest and lowest numbers
        int highest = numbers[0];
        int lowest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // print the highest and lowest numbers
        System.out.println("The highest number is " + highest);
        System.out.println("The lowest number is " + lowest);
    }

}
