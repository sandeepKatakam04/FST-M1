package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args){

        //create a browser instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://www.training-support.net");

        //close the browser
        driver.close();
    }
}
