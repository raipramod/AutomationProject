package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoderWebsite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement amazonSearch = driver.findElement(By.name("field-keywords"));
        amazonSearch.sendKeys("Pramod Rai");
        amazonSearch.submit();
    }
}
