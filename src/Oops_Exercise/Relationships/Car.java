package Oops_Exercise.Relationships;

public class Car {
    // Methods implementation and class/Instance members
    private String color;
    private int maxSpeed;
    public void CarInfo(){
        System.out.println("Car Color= "+color +"Max Speed= "+maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
