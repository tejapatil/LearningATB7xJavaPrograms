package August_Liveprograms.ex_11082024.RealLIFEex;

public class Lab189 {
    public static void main(String[] args) {
        CHROME c= new CHROME();
        String s=c.openBrowser("Chrome");
        System.out.println(s);
        c.closeBrowser("Chrome");

        System.out.println(" Running firefox now...............\n");

        FIREFOX f=new FIREFOX();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takeScreenshot();
    }
}
