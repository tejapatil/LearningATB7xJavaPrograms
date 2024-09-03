package August_Liveprograms.ex_11082024.RealLIFEex;

abstract class BaseClass extends GrandBaseClass {
    //Web automation
    //Single
    //Hide the Funtionality of the open and close browser

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);
    BaseClass(){}

    @Override
    void takeScreenshot() {
        System.out.println("Ok Taking ScreenShot");
    }
}
