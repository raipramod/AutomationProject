//package com.company;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class Todolistlooping {
//
//    public static void main(String[] args) throws InterruptedException {
//        String [] tasks = {"Cooking", "Traveling", "Driving","Painting","Cleaning", "Fishing","Reading", "Learning","Grocery","Shopping"};
//        System.setProperty("webdriver.chrome.driver", "/Users/pranudeeptuladhar/Documents/chromedriver");
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://webdriveruniversity.com/To-Do-List/index.html&quot;);
//        for (String task: tasks) {
//            Thread.sleep(1000);
//            WebElement todolist = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
//            todolist.sendKeys(task);
//            todolist.sendKeys(Keys.ENTER);
//
//        }
//
//
//    }
//}