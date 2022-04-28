package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WrapsElement;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//
//        WebElement googleBox=driver.findElement(By.name("q"));
//        googleBox.sendKeys("Apple Computer");
//        googleBox.submit();

        driver.get("https://www.amazon.com/");
        WebElement amazonSearch = driver.findElement(By.name("field-keywords"));
        amazonSearch.sendKeys("samsung phone");
        amazonSearch.submit();

    }
}
