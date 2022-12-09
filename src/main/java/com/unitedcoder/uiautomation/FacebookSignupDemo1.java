package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FacebookSignupDemo1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        //open Amazon home page
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
       // driver.findElement(By.id("u_0_0_b4")).click();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Abdullah");
        driver.findElement(By.name("lastname")).sendKeys("karluk");

        WebElement day=driver.findElement(By.id("day"));
        List<WebElement> option=driver.findElements(By.xpath("//*[@id=\"day\"]/option"));
        for (int i=0;i<option.size();i++){
            if (option.get(i).getText()=="20")
            System.out.println(option.get(i).getText());
        }





    }

}
