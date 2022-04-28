package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Demo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
        firstName.sendKeys("Pramod");

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
        lastName.sendKeys("Rai");

        WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
        emailAddress.sendKeys("abc@gmail.com");

        WebElement comments = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
        comments.sendKeys("I am writing comment");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        button.click();

    }
}
