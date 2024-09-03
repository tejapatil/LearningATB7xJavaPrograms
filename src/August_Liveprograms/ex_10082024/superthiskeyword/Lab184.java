package August_Liveprograms.ex_10082024.superthiskeyword;

public class Lab184 {
}
    // is A relation - inheritance
class Students extends Person{
    //is A relation-inheritance
        @Override
        void message(){
            System.out.println("I am a student");
        }
        void display(){
            super.message();
        }


    }
    class Person {
    void message(){
        System.out.println("I am person message");
    }
    }
