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

public class FacebookSignupDemo {
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
        Select selectDay=new Select(day);
        selectDay.selectByValue("4");
        List<WebElement> option=driver.findElements(By.xpath("//*[@id=\"month\"]/option"));
        for (WebElement element:option){
            if (element.getText().equalsIgnoreCase("may")){
                element.click();
                break;
            }
        }
        WebElement year=driver.findElement(By.id("year"));
        Select selectYear=new Select(year);
        List<WebElement> option1=selectYear.getOptions();
        for (int i=0;i<option1.size();i++){
            if (Integer.parseInt(option1.get(i).getText())==2000){
                option1.get(i).click();
                break;
            }
        }





    }

}
