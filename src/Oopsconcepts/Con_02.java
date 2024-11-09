package Oopsconcepts;
// Java Program to Illustrate Invocation
// of Constructor Calling With Usage
// of super Keyword

// Class 1
// Super class

class Base1 {
    int x;

    // Constructor of super class
    Base1(int _x) {
        x = _x;
    }
}
//Class 2
//sub class
class Derived1 extends Base1{
    int y;

    //constructor of subclass
    Derived1(int _x, int _y){
        // super keyword refers to super class
        super(_x);
        y = _y;
    }
    // Method of sub class
    void Display(){
        //Print statement
        System.out.println("x= " + x +" y = " + y);
    }

}
//Class 3
//main class
public class Con_02 {
    //main driver method
    public static void main(String[] args) {
        // Creating object of sub class
        // inside main() method

        Derived1 d =new Derived1(10, 20);

        // Invoking method inside main() method
        d.Display();
    }
}


