/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nestng_annotations;

import com.mycompany.nestng_annotations.TestNGMethods;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Dell
 */
public class NestNG_Annotations {
    
    TestNGMethods tng = new TestNGMethods(null);
    @BeforeClass
    public void testSetUp(){
        tng.browserSetUp();
        tng.implicitWait();
        tng.screenMaximize();
    }
    @BeforeMethod
    public void openBrowser(){
        tng.getURl("http://192.168.20.149:8013/");
        By locator1 = By.xpath("//span[@class='mr-2 d-inline text-red-900 medium']");
        tng.clickElement(locator1);
        System.out.println("The current URL is:" + tng.getCurrentURL());
    }
    @Test(description="testing for login page with different attributes")
    public void testLogin(){
        By email = By.xpath("//input[@type='email']");
        tng.sendData(email, "achyutthapa6@gmail.com");
        By password = By.xpath("//input[@type='password']");
        tng.sendData(password, "Dishhome@123");
        By buttonClick = By.xpath("//button[@id='login-submit']");
        tng.clickElement(buttonClick);
    }
    @AfterMethod
    public void postLogin(){
        System.out.println("Url of next page is"+tng.getCurrentURL());
    }
    @AfterClass
    public void afterClass(){
        tng.quitScreen();
        
    }
   
}
