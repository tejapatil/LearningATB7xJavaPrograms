package Excersize;

public class ForLoopDivisibleBy7 {
    public static void main(String[] args) {
        for (int i=100; i>0; --i)
            {
                if(i%7 ==0){
                    System.out.print(i);
                    System.out.print(", ");
                }
            }
    }
}
