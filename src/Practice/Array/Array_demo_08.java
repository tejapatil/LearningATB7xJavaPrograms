package Practice.Array;

public class Array_demo_08 {
    public static void main(String[] args) {
    int arr[] = {3, 1, 2, 5, 4};

    // passing array to method m1
    sum(arr);
}
public static void sum(int [] arr){

    // getting sum of array values
    int sum =0;

    for (int i=0; i< arr.length; i++)
    sum +=arr[i];
    System.out.println("Sum of array values : "+sum);

}
}



