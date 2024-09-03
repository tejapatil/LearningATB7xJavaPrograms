package Oops_Exercise;

public class Cat {
    private String name;
    private int age;

    public Cat() {
        // Initialize name to "Unknown"
        this.name="Unknown";
        // Initialize age to 0
        this.age=0;
    }


    // Main method to test the Cat class
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat mycat=new Cat();
        // Print the values of the instance variables
        System.out.println("Cat's Name: " +mycat.name);
        System.out.println("Cat's Age: "+ mycat.age);
    }




}
