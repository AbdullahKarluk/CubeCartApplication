package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMultipleSearchWithObject {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //open Amazon home page
        driver.navigate().to("https://amazon.com");
        driver.manage().window().maximize();
        String[] productName={"Apple "+Math.random()*100,"Ipad","Canon R5"};
        for (String keyWords:productName){

            WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWords+ Keys.ENTER);
            driver.navigate().back();
            //driver.switchTo().newWindow(WindowType.  TAB);
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
