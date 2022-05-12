package activities;

import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        //get the title of the page
        String Page_title = driver.getTitle();
        System.out.println("Title of the page is: " + Page_title);

        //Find checkbox and toggle button
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

        //Click the toggle button
        toggleCheckboxButton.click();

        //wait for the checkbox o disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        //Click toggle button again
        toggleCheckboxButton.click();

        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();

        //Close browser
        driver.close();


    }
}
