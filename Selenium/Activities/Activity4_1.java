package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) {

        //create a browser instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://www.training-support.net/");

        //get the title of the page
        String Page_title = driver.getTitle();
        System.out.println("Title of the page is: "+ Page_title);

        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        //Print title of new page
        System.out.println("Heading is: " + driver.getTitle());
        //close the browser
        driver.close();

    }
}
