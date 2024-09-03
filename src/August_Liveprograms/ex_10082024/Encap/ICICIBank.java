package August_Liveprograms.ex_10082024.Encap;

public class ICICIBank {

    //#Encapsulation
    //- Encapsulation is fundamental in object oriented programming(OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- methods with getter and setter only, you can access the data members/ attributes.

    private String Name;
    private long bal;

    public ICICIBank(String name, long bal){
        this.Name= name;
        this.bal=bal;
    }


    public long getBal(boolean isAdmin) {
        if(isAdmin){
            return bal;
        }
        return 0;
    }

    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed!");
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name, boolean isAdmin){
            if (isAdmin) {
                this.Name = name;
                System.out.println("Allowed");
            } else {
                System.out.println("Not allowed!");
            }
        }
}
