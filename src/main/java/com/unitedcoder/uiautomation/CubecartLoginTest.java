package com.unitedcoder.uiautomation;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CubecartLoginTest {
    public static void main(String[] args) {
        String username1="testautomation1";
        String password1="automation123!";
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.findElement(By.id("username")).sendKeys(username1);
        driver.findElement(By.id("password")).sendKeys(password1);
        driver.findElement(By.id("login")).click();
        WebElement logout=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        if (logout.isDisplayed()){
            System.out.println("Test is successful");
        }
        else {
            System.out.println("Test failed");
        }
        CustomerInfo customerInfo=new CustomerInfo("Perhat"+System.currentTimeMillis(),
                "Polat"+System.currentTimeMillis(),
                "asgfaga"+System.currentTimeMillis()+"@gmail.com",
                "Mr");
        driver.findElement(By.linkText("Customer List")).click();
        driver.findElement(By.xpath("//*[contains(text(),\"Add Customer\")]")).click();
        driver.findElement(By.id("cust-title")).sendKeys(customerInfo.getTitle());
        driver.findElement(By.id("cust-firstname")).sendKeys(customerInfo.getFirstName());
        driver.findElement(By.id("cust-lastname")).sendKeys(customerInfo.getLastName());
        driver.findElement(By.id("cust-email")).sendKeys(customerInfo.getEmail());
        WebElement type=driver.findElement(By.id("cust-type"));
        Select dropDown=new Select(type);
        dropDown.selectByValue("1");
        driver.findElement(By.name("save")).click();
        WebElement successfully=driver.findElement(By.cssSelector(".success"));
        if (successfully.isDisplayed()){
            System.out.println("Test passed");
        }else {
            System.out.println("Failed");
        }
        WebElement logOut=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOut.click();
        driver.close();
        driver.quit();


    }
}
