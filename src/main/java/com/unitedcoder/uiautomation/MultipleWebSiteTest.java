package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWebSiteTest {
    public static void main(String[] args) throws InterruptedException {
        Map<String,String> webSites=new HashMap<>();
        webSites.put("Google","https://www.google.com");
        webSites.put("YouTube","https://www.youtube.com");
        webSites.put("Amazon","https://www.amazon.com");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //open Amazon home page
        driver.manage().window().maximize();
        Set<String> keys=webSites.keySet();
        for (String k:keys){
            StopWatch time=new StopWatch();
            time.start();
            driver.get(webSites.get(k));
            if (driver.getTitle().contains(k)){
                time.stop();
                System.out.println(k+" Opened Successfully in: "+time.getTime(TimeUnit.MILLISECONDS));

            }

        }
        driver.close();
        driver.quit();
    }
}
