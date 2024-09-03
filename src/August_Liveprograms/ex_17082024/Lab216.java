package August_Liveprograms.ex_17082024;

public class Lab216 {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println("Div by zero");
            //pramod.getMessage();
        } finally {
            System.out.println("I will be always Executed, anyHow !!");
        }
    }
}
