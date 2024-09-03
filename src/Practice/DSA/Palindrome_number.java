package Practice.DSA;

public class Palindrome_number {
    public static void main(String[] args) {
        int num=2442, reversedNum  =0, remainder;

        //store the number to OriginalNum
        int OriginalNum= num;

        //get the reverse of originalNum
        //store it in variable
        while(num!=0){
            remainder= num%10;
            reversedNum =reversedNum *10 +remainder;
            num /=10;
        }
        //check if reversedNum and OriginalNum are equal
        {
            if(OriginalNum == reversedNum){
                System.out.println(OriginalNum +" is a palindrome. ");
            }else{
                System.out.println(OriginalNum +" is not a palindrome");
            }
        }
    }
}
