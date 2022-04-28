package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");


        WebElement userName = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        userName.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("admin");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();
    }
}
