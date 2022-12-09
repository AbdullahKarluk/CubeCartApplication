package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
    static WebDriver webDriver;
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        webDriver=new ChromeDriver(options);
        webDriver.manage().window().maximize();
        webDriver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    }
//    public static void explicitWait(WebElement element,int timeOut){
//        WebDriverWait wait=new WebDriverWait(webDriver,timeOut);
//        wait.until(ExpectedConditions.visibilityOf(element));
//
//    }
    public static void implicitWait(int second){
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
    }
    public static void sleep(int sec){
        try {
            Thread.sleep(2000*sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logIn(String userName,String password){
        webDriver.findElement(By.id("username")).sendKeys(userName+Keys.TAB+password+Keys.ENTER);
        //webDriver.findElement(By.id("password")).sendKeys(password+ Keys.ENTER);
    }
    public static void logOut(){
        webDriver.findElement(By.cssSelector(".fa.fa-sign-out")).click();
        webDriver.close();
        webDriver.quit();

    }



}
