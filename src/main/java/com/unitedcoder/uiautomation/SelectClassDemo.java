package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        //open Amazon home page
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select=new Select(dropDown);
//        select.selectByValue("USD");
//        Thread.sleep(2000);
//        select.selectByVisibleText("AED");

        List<WebElement> option=select.getOptions();
        for (int i=0;i<option.size();i++){
            String currencyValue=option.get(i).getText();
            if (currencyValue.equalsIgnoreCase("usd")){
                option.get(i).click();
                break;
            }
        }





    }

}
