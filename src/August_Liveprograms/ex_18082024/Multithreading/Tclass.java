package August_Liveprograms.ex_18082024.Multithreading;

public class Tclass {
    public static void main(String[] args) {

        Test<Integer> i= new Test<Integer>(5);
        System.out.println(i.getObject());

        Test<Double> i2= new Test<Double>(7.2);
        System.out.println(i2.getObject());

        Test<String> i3= new Test<String>("Tejaswini");
        System.out.println(i3.getObject());
    }
}
class Test<T>{
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}
