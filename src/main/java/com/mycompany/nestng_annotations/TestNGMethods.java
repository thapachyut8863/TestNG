/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nestng_annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Dell
 */
public class TestNGMethods {
    private WebDriver driver;
    public TestNGMethods(WebDriver driver){
        this.driver= driver;
    }
    public void browserSetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
    }
    public void getURl(String url){
        driver.get(url);
    }
    
    public void screenMaximize(){
        driver.manage().window().maximize();
    }
    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
    public void clickElement(By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }
    public void sendData(By locator, String data){
        WebElement element = driver.findElement(locator);
        element.findElement(locator).sendKeys(data);
    }
    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void quitScreen(){
        if(driver!=null){
            driver.quit();
        }
    }
    
    
}
