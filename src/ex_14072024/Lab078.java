package ex_14072024;

public class Lab078 {
    public static void main(String args[]){
        String password = "Tejaswini@123";
        String pass_u= password.toLowerCase();
        System.out.println(pass_u);
        //pass_u= password;
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Tejaswini@123 =  tejaswini@123  = TEjaswini@123 = TejaSwini@123

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());

    }
}
