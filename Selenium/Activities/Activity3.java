package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        //create a browser instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");

        //get the title of the page

        String Page_title = driver.getTitle();
        System.out.println("Page title is: " + Page_title);

        //Find the input fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Sandeep");
        lastName.sendKeys("Katakam");

        //Enter the email
        WebElement mail = driver.findElement(By.id("email"));
        mail.sendKeys("test@fst.com");

        //Enter the contact number
        WebElement contact = driver.findElement(By.id("number"));
        contact.sendKeys("112233");

        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();

        //Close the browser
        driver.close();

    }
}
