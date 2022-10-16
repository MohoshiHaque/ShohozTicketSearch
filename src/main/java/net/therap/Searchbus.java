package net.therap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbus {
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shohoz.com/bus-tickets");

        //Departure City
        WebElement departure1 = driver.findElement(By.id("dest_from"));
        departure1.sendKeys("Dhaka");
        Thread.sleep(2000);

        //Destination City
        WebElement destination = driver.findElement(By.id("dest_to"));
        destination.sendKeys("Chittagong");
        Thread.sleep(2000);

        //Date of Journey
        WebElement calendaricon1 = driver.findElement(By.id("doj"));
        calendaricon1.click();

        WebElement calendardatej = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a"));
        calendardatej.click();
        Thread.sleep(2000);

        //Date of Return
        WebElement calendaricon2 = driver.findElement(By.id("dor"));
        calendaricon2.click();

        WebElement calendardater = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a"));
        calendardater.click();
        Thread.sleep(2000);

        //Search Buses button click
        WebElement submitsearch = driver.findElement(By.xpath("//*[@id=\"bussearch\"]/ul/div[5]/div[2]/button"));
        submitsearch.click();

    }
}
