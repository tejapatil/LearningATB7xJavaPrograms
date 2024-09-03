package August_Liveprograms.ex_17082024;

public class Lab212 {
    public static void main(String[] args) {
        System.out.println("Started of the program");

        int b= 0; //ArithmeticException
        try {
            String ip=args[0];
            int a = Integer.parseInt(ip);
            b=1000/a;
        } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(b);
        System.out.println("End of the program");
    }
}
