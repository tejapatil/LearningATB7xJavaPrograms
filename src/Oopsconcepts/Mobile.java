package Oopsconcepts;

public class Mobile {
    private String manufacturer;
    private String operating_system;
    public String model;
    private int cost;
    //Constructor to set properties/characteristics of object
    Mobile(String man, String o, String m, int C){
       this.manufacturer =man;
       this.operating_system=o;
       this.model=m;
       this.cost=C;
    }
    //Method to get access Model property of Object
    public String getModel(){
        return this.model;
    }
}
