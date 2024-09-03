package August_Liveprograms.ex_10082024.Poly.methodoverriding;

public class Lab182 {
    //Method overriding | Runtime Poly
    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.bark();
        h1.bike();

        Dog d1=new Dog();
        d1.bark();

        Dog dog_Ref=new Hound();
        dog_Ref.bark(); //Override functions
        //dog_Ref.bike();

        //Hound h2=new Dog();
    }
}
