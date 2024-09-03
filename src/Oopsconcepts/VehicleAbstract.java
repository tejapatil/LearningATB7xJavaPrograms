package Oopsconcepts;

public abstract class VehicleAbstract {
    public abstract void start();

    public void stop() {
        System.out.println("Stopping vehicle in abstract class");
    }
}
class TwoWheeler extends VehicleAbstract{
    @Override
    public void start() {
        System.out.println("Staring two wheeler");
    }
}

class FourWheeler extends VehicleAbstract {
    @Override
    public void start() {
        System.out.println("Starting four wheeler");
    }
}

