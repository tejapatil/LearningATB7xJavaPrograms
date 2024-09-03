package August_Liveprograms.ex_04082024;

public class Lab165 {
   int e=45;//Instance variable !=Global variable

    void f1(){
        int e=10; //local variable
        System.out.println(e);
    }
    void f2(){
        e=50;
        System.out.println(e);
    }
}
