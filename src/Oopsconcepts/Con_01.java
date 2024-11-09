package Oopsconcepts;

// Java Program to Illustrate
// Invocation of Constructor
// Calling Without Usage of
// super Keyword

// Class 1
// Super class

class Base{
    // Constructor of super class

    Base()
    {
        //Print statement
        System.out.println("Base Class Constructor called");
    }
}

//Class2
//Sub class
class Derived extends Base {
    //constructor of sub class

    Derived() {
        //Print statement
        System.out.println("Derived Class Constructor called");
    }
}

//class2
//main class

public class Con_01 {
    //main driver method
    public static void main(String[] args) {
        //Creating an object of sub class
        //inside the main method
        Derived d=new Derived();

        // Note: Here first super class constructor will be
        // called there after derived(sub class) constructor
        // will be called
    }

}
