package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {

    WebDriverWait wait;
    WebDriver driver;

    @Given("^User is on login page$")
    public void UserIsOnLoginpage(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @When("^User enters Username and password$")
    public void UserEntersUsernameAndPassword(){
        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    @Then("^Read the page title and confirmation message$")
    public void ReadPageTitleAndConfirmationMessage(){

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

        //Print the page title and heading
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
    }
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void User_enters_and(String username, String password){
        driver.findElement(By.name("Username")).sendKeys(username);
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    @And("^Close the browser$")
    public void CloseTheBrowser(){
        driver.close();
    }
}
