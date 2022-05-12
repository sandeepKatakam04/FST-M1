package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args){

            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://training-support.net/selenium/dynamic-attributes");
            //get the title of the page
            String Page_title = driver.getTitle();
            System.out.println("Title of the page is: " + Page_title);

            //Find username and password fields
            WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
            WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
            //Type credentials
            userName.sendKeys("admin");
            password.sendKeys("password");
            //Click Log in
            driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

            //Print login message
            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
            System.out.println("Login message: " + loginMessage);

            //Close browser
            driver.close();
    }
}
