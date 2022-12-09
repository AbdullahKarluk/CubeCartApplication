package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AmazonSearch {
   private String keyWords;

    public AmazonSearch(String keyWords) {
        this.keyWords = keyWords;
    }
    public  void run(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(keyWords+Keys.ENTER);
        WebElement result=driver.findElement(By.xpath("//*[contains(text(),"+keyWords+")]"));
        if (result.isDisplayed()){

            System.out.println("Test is passed!!");
        }
        else {
            System.out.println("Thest Faild!");
        }
    }


}
