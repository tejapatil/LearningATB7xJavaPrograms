package August_Liveprograms.ex_11082024.excar;

import java.sql.SQLOutput;

public class Tesla extends Engine {
    void drive(){
        OpenCar();
        start();
        partGearBox();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stopping Tesla");

    }

    @Override
    void speed() {
        System.out.println("300km.hr");

    }

    @Override
    void partGearBox() {
        System.out.println("Electric");

    }

    @Override
    void OpenCar() {
        System.out.println("open Tesla");
    }
}
