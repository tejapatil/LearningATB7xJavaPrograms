package Practice.DSA;

public class findMissingNumber {
    public static void main(String[] args) {

        // Define the array with one missing number
        int a[]={1, 2, 3, 4, 6, 7, 8, 9, 10}; //(missing 5)

        // Calculate the sum of the array elements
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum = sum + a[i]; // Sum the elements of the array
        }
        System.out.println(sum); //Output the sum of the array elements (should be 50)

        //calculate the sum of the first 10 natural numbers
        int sum1= 0;
        for(int j=1; j<=10; j++){
            sum1=sum1+j;
        }
        System.out.println(sum1);//
        //find the missing number
        System.out.println("missing number is: "+(sum1 - sum)); // Calculate and output the missing number (55 - 50 = 5)

    }
}
