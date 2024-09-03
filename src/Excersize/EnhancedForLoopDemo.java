package Excersize;

public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        int []myArray=new int[10];
        int i=0;
        //Traditional for loop to populate
        for(int k=100; k>0; k=k-10, i++)
        {
            myArray[i]=k;
        }
        //Enhanced for loop to print elements of array
        for(int loopVal: myArray)
        {
            System.out.println(loopVal);
        }

    }
}
