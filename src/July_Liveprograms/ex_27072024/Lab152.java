package July_Liveprograms.ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        //Strings immutable in nature.
        // StringBuilder , StringBuffer

        String s1="PRAMOD";
        s1="Dutta";

        StringBuffer stringBuffer=new StringBuffer("Shresth");
        // change [the value of string - Buffer
        stringBuffer.append("Hatti");//ShresthHatti
        stringBuffer.append("JI"); //ShresthHatti

        StringBuilder stringBuilder= new StringBuilder("Tejaswini");
        stringBuilder.append("Patil");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)



    }
}
