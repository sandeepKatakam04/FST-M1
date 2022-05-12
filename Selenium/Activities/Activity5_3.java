package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {

        //create browser instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //get the title of the page
        String Page_title = driver.getTitle();
        System.out.println("Title of the page is: " + Page_title);

        //find the textbox
        WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));

        //Print the status of textbox
        System.out.println("The checkbox is selected: " + textbox.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        //Print status
        System.out.println("The checkbox is selected: " + textbox.isEnabled());

        //Close the browser
        driver.close();
    }
}
