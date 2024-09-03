package July_Liveprograms.ex_28072024;

public class Lab156 {
    public static void main(String[] args) {
        // functions - perform a task , block of code
        // functions within the class are called -> methods?
        // class -> blueprint
        // object ->  real entity created from the class. / instance of the class

        Dog dog1Ref= new Dog();
        dog1Ref.name="chow chow";

        Dog dog2Ref= new Dog();
        dog2Ref.name="German shepherd";
        System.out.println(dog1Ref.name + "and  " +dog2Ref.name);
    }
}
