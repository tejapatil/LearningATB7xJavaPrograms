package August_Liveprograms.ex_18082024.Multithreading;

public class MaxThreeGeneric_Demo {
    public static <DT extends Comparable<DT>> DT maximumOF(DT a, DT b, DT c){
        DT max =a;
        if(b.compareTo(max) >0){
            max =b;
        }
        if(c.compareTo(max) >0){
            max =c;
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(maximumOF(89,54,48));
        System.out.println(maximumOF(5.4, 5.9,4.5));
        System.out.println(maximumOF('p','x','z'));

    }
}
