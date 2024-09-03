package August_Liveprograms.ex_11082024.ex_interface.ex3;

public class Lab192 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.m1();
        c.suite();

    }
}
interface Eng{
    void start();
    default void m1(){
        System.out.println("Old M1");
    }
    default void suite(){
        System.out.println("Wear suite");
    }
}

interface GearBox extends Eng{
    void gear();
}
interface Keys extends GearBox{
    void openCar();
}

class Car implements Keys{

    @Override
    public void openCar() {
        System.out.println("Starting");

    }

    @Override
    public void gear() {

    }

    @Override
    public void start() {

    }
}
