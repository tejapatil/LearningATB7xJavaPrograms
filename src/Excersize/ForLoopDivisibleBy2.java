package Excersize;

public class ForLoopDivisibleBy2 {
    public static void main(String[] args) {
        for(int i=50; i>0; --i)
            if(i%2 ==0){
                System.out.print(i);
                System.out.print(",");
        }
    }
}
