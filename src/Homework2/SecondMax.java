package Homework2;

public class SecondMax {
    public static int second(int[] arr) {
        int highest = arr[0];
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j >= highest) {
                highest = j;
            } else if (j > second) {
                second = j;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 7};
        int result = second(salaries);
        System.out.println(result);
    }
}
