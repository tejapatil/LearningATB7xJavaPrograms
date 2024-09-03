package Excersize;

public class FirstNatural_sum {
    public static void main(String[] args) {
        int i;
        int sum=0;
        System.out.println("The first 10 natural numbers are:\n");
        for(i=1; i<=10 ;i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto "+i+ " terms : " +sum);

    }
}
