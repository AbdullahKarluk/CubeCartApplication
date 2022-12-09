package com.unitedcoder.cubecartautomation;

import com.unitedcoder.uiautomation.AmazonSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubecartAddCustomer {
    public static void main(String[] args) {

        LoginUser loginUser = new LoginUser();
        loginUser.setUserName("testautomation1");
        loginUser.setPassword("automation123!");
        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.findElement(By.id("username")).sendKeys(loginUser.getUserName());
        driver.findElement(By.id("password")).sendKeys(loginUser.getPassword());
        driver.findElement(By.id("login")).click();;
        CustomerInfo customerInfo=new CustomerInfo("Ilyas"+System.currentTimeMillis(),"Karluk"+System.currentTimeMillis(),
               "ilyas"+System.currentTimeMillis(),"Phone");
        WebElement customerLink=driver.findElement(By.linkText("Customer List"));
        customerLink.click();
        WebElement addCustomerLink=driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
        addCustomerLink.click();



    }
}
