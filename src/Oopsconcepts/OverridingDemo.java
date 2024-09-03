package Oopsconcepts;
public class OverridingDemo {
    public static void main(String[] args) {
        //Creating Object of SuperClass and calling getModel Method
        Mobile m=new Mobile("Nokia", "Win8","Lumia", 1000);
        System.out.println(m.getModel());

        //Creating Object of Sublcass and calling getModel Method
        Android a=new Android("Samsung", "Android", "Grand", 3000);
        System.out.println(m.getModel());

        //Creating Object of Sublcass and calling getModel Method
        Blackberry b=new Blackberry("BlackB","RIM","Curve",2000);
        System.out.println(m.getModel());
    }
}
