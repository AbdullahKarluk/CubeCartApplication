package com.unitedcoder.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaLoopExerciseFour {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        ChromeOptions option=new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        for (int i=0;i<3;i++) {

            chrome.get("https://www.google.com.tr/");
            chrome.manage().window().maximize();
            Thread.sleep(2000);


            chrome.close();

        }
    }
}
