package August_Liveprograms.ex_17082024;

public class Lab215 {
    public static void main(String[] args) {
        final double pi=3.14;
        int a=10;

        try {
            int x=10/a;
        } catch (Exception e) {
            System.out.println("Div by zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }

    }
}
