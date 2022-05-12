package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");

        //Get columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        //Get Rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));

        //Number of columns
        System.out.println("No. of colomns in the table is: "+cols.size());
        //Number of rows
        System.out.println("No. of rows in the table is: "+rows.size());

        //Print all the values in third row
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
            System.out.println("Cell Value: " + cellValue.getText());
        }
        //Cell value of second row, second column
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());

        //close the driver
        driver.close();

    }
}

