package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ToDo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://mdn.github.io/todo-react-build/");

        WebElement inputBox = driver.findElement(By.name("text"));
        inputBox.sendKeys("Hello");
        inputBox.submit();
    }
}
