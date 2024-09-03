package August_Liveprograms.ex_24082024;

public class Lab240 {
    public static void main(String[] args) {
        Person p1=new Person("Tejaswini", "Pune");
        Person p2=new Person("Pramod", "KA");
        Person p3=new Person("Lucky", "New Delhi");


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
class Person extends Object{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID ->"+name + " Address- > " +address;
    }
}
