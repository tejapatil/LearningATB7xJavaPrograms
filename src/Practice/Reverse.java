package Practice;

public class Reverse {
    public static void main(String args[]){
        String str="Geeks", nstr="";
        char ch;

        System.out.println("Original word");
        System.out.println("Geeks");//

        for(int i=0; i<str.length(); i++){
            ch=str.charAt(i);//extracts each character
            nstr= ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
}
