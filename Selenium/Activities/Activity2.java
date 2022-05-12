package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {

        //create a browser instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://www.training-support.net");

        //get the title of the page

        String Page_title = driver.getTitle();

        System.out.println("Page title is: " + Page_title);

        //Find the About Us link using id()
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idLocator.getText());

        //Find the About Us link using className()
        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("Text in element: " + classNameLocator.getText());

        //Find the About Us link using cssSelector()
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());

        //Find the About Us link using linkText()
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());

        //close the browser
        driver.close();
    }
}
