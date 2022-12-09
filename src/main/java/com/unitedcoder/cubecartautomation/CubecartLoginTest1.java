package com.unitedcoder.cubecartautomation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubecartLoginTest1 {
    public static void main(String[] args) throws InterruptedException {
        LoginUser loginUser = new LoginUser();
        loginUser.setUserName("testautomation1");
        loginUser.setPassword("automation123!");

        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(loginUser.getPassword(),Keys.RETURN);
        Thread.sleep(3000);
//        WebElement logoutLink=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
//        if (logoutLink.isDisplayed()){
//            System.out.println("Login Test Passed");
        WebElement dashBoard=driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));
        if (dashBoard.getText().equalsIgnoreCase("dashboard")){
            System.out.println("Login test successful");
        }else {
            System.out.println("Login test failed");
        }
        driver.close();





    }



    }

