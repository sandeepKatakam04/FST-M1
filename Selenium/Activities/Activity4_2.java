package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {

        //create a browser instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");

        //get the title of the page
        String Page_title = driver.getTitle();
        System.out.println("Title of the page is: " + Page_title);
        //Find the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Sandeep");
        lastName.sendKeys("katakam");

        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("activities@test.com");

        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1223344124");

        //Enter Message
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}
