
package com.unitedcoder.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.IntrospectionException;
import java.util.Scanner;

public class SearchWords {
    public static void main(String[] args) throws InterruptedException {
        //define driver--chromedriver
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        Scanner word=new Scanner(System.in);
        System.out.println("Enter your words: ");
        String box=word.nextLine();
        //define chrome driver object
        WebDriver searchWords=new ChromeDriver();
        //open Amazon home page
        searchWords.get("https://dictionary.cambridge.org/tr/");
        searchWords.manage().window().maximize();
        searchWords.findElement(By.id("searchword")).sendKeys(box+ Keys.ENTER);
        Thread.sleep(2000);

        WebDriver newtab=searchWords.switchTo().newWindow(WindowType.TAB);
        newtab.get("https://lughet.com/");
        newtab.findElement(By.id("phrase")).sendKeys(box+ Keys.ENTER);
        /*WebElement resultStatusElement=newtab.findElement(By.className("def def-uyghur"));
        System.out.println("Result displayed: "+resultStatusElement.isDisplayed());*/
        Thread.sleep(2000);

        WebDriver newtab1=searchWords.switchTo().newWindow(WindowType.TAB);
        newtab1.get("https://www.youdao.com/");
        WebElement search1=newtab.findElement(By.id("search_input"));
        search1.sendKeys(box+ Keys.ENTER);
        Thread.sleep(20000);


        searchWords.quit();








    }
}
