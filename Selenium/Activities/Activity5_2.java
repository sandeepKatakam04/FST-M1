package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {

        //create browser instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //get the title of the page
        String Page_title = driver.getTitle();
        System.out.println("Title of the page is: " + Page_title);

        //Find the checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox input is selected : " + checkbox.isSelected());

        //Select the checkbox
        checkbox.click();

        //check the status if checkbox
        System.out.println("The checkbox input is selected : "+ checkbox.isSelected());

        //close the browser
        driver.close();
    }
}
