package com.unitedcoder.cubecartautomation;


import com.unitedcoder.classconcepts.ProductObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AddProduct extends BaseClass{
    public static void main(String[] args) {
        openBrowser();
        implicitWait(10);
        logIn("testautomation1","automation123!");
        ProductObject product1=new ProductObject("Ipad2022","48552555","850g",
                "12","1150$");
        ProductObject product2=new ProductObject("Iphone","48555557","550g",
                "17","1250$");
        List<ProductObject> productObjectList=new ArrayList<>();
        productObjectList.add(product1);
        productObjectList.add(product2);
        addProduct(product1);
        addProduct(product2);




        logOut();



    }
    public static void addProduct(ProductObject productObject) {
        webDriver.findElement(By.id("nav_products")).click();
        webDriver.findElement(By.linkText("Add Product")).click();
        webDriver.findElement(By.id("name")).sendKeys(productObject.getProductName());
        webDriver.findElement(By.id("product_code")).sendKeys(productObject.getProductCode());
        webDriver.findElement(By.xpath("(//img[@title='Disable'])[2]")).click();
        webDriver.findElement(By.id("product_weight")).sendKeys(productObject.getProductWeight());
        webDriver.findElement(By.id("stock_level")).sendKeys(productObject.getStockLevel());
        webDriver.findElement(By.linkText("Pricing")).click();
        webDriver.findElement(By.id("price")).sendKeys(productObject.getPrices());
        webDriver.findElement(By.xpath("//input[@value='Save']")).click();
    }
}
