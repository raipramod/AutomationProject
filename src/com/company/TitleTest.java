package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://javaguide.technologychannel.org/");
        String expectedTitle = "hello java";
        String automationTitle = driver.getTitle();

        if (expectedTitle.equals(automationTitle)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
