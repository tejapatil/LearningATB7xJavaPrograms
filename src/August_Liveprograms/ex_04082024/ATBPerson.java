package August_Liveprograms.ex_04082024;

public class ATBPerson {

    String name;
    long phone;

    //DC
    ATBPerson(){
        System.out.println("Object is created!");
    }

    ATBPerson(String nameGiven){
        this.name=nameGiven;
        //this is current class.
    }

    ATBPerson(String nameGiven, long phoneNumber){
        this.name=nameGiven;
        this.phone=phoneNumber;
    }
}