package Homework2;

public class left_angle {
    public static void main(String args[]){
        //row denotes the number of rows you want to print
        int row=6;
        //outer loop for rows
        for(int i=0; i<row; i++){
            //inner loop for columns
            for (int j=2*(row-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                //prints star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
