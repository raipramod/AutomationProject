package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
        // identify elements in menu with findElements
        List<WebElement> p = driver.
                findElements(By.xpath("//ul[@class='toc reading']/li"));
        System.out.println("Menu Items are: ");
        //iterate through list
        for (WebElement i : p) {
            System.out.println(i.getText());
            //driver.quit();
        }
    }
}
