package Practice;

public class string_01 {
    public static void main(String args[]){
        String name=new String("Tejaswini");
        String description=new String(" is a automation tester");

        //Concatenation
        String sentence=name + description;
        System.out.println(sentence);

       // CharAt
        String name1 = new String("Tejaswini");
        System.out.println(name1.charAt(0));

        //ToLower
        String s=new String("Tejaswini");
        System.out.println(s.toLowerCase());

        //Toupper
        String s1=new String("Tejaswini");
        System.out.println(s1.toUpperCase());


       // Substring
        String name2 = new String("AmanAndAkku");
        System.out.println(name2.substring(0, 5));

       // Length
        String name3 = new String("Aman");
        System.out.println(name3.length());

       // Replace
        String name4 = new String("Aman");
        System.out.println(name4.replace('a', 'b'));
    }
}
