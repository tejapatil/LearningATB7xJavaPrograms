package Oopsconcepts;

public class Android extends Mobile {
    //Constructor to set properties/characteristics of object
    Android(String man, String o, String m, int C){
        super(man, o, m, C);
    }
    //Method to get access Model property of Object
    public String getModel(){
        return "This is Android Mobile- " + model;
    }
}
