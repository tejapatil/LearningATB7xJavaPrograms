package July_Liveprograms.ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program!");
        String browserName= sc.next();
        browserName= browserName.toLowerCase();

        switch (browserName) {
            case "chrome":
                System.out.println("starting the chrome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "firebox":
                System.out.println("Starting the firebox browser");
                // Further code to start the firebox
                // Webdriver driver = new firebox(); // Selenium Code
                break;
            case "edge":
                System.out.println("execute the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }

        }
    }
