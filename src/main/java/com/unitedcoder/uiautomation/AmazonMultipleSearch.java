package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMultipleSearch {
    public static void main(String[] args) throws InterruptedException {
        //define driver--chromedriver
       //System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //open Amazon home page
        driver.navigate().to("https://amazon.com");
        driver.manage().window().maximize();
        for (String keyWords:args){

            WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWords+ Keys.ENTER);
            driver.navigate().back();
        }
        driver.close();
//        driver.findElement(By.id("twotabsearchtextbox")).click();
//        for (int i=0;i<=3;i++){
//            Thread.sleep(1000);
//            driver.findElement(By.id("hrefIncAdt")).click();
//        }
//        driver.close();
//        WebElement searchBox=driver.findElement(By.name("q"));
//        searchBox.sendKeys("Iphone14"+ Keys.ENTER);
       //WebElement searchBox1=driver.findElement(By.id("twotabsearchtextbox"));
        //searchBox1.sendKeys("ipad"+ Keys.ENTER);

    }
}
