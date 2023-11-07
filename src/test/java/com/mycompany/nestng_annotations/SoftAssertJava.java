/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nestng_annotations;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 *
 * @author Dell
 */
public class SoftAssertJava {
    TestNGMethods tng = new TestNGMethods(null);
    
    @BeforeTest
    public void setUp(){
       
    tng.browserSetUp();
    tng.getURl("http://192.168.20.149:8013/");
    tng.screenMaximize();
    tng.implicitWait();
    }
    @Test(description="this is the test of softassertion")
    public void softAssertionTu(){
        //hence using the softassert assertion will excute the test even one of the test fails others will execute.
        SoftAssert softassert = new SoftAssert();
        
        
        String expectedTitle = "vehicle Vehicle Management - Vehicle Management";
        String actualTitle = tng.getCurrentTitle();
        softassert.assertEquals("It is a test of title", expectedTitle, actualTitle);
        System.out.println("Verifying title");
        String expectedtext = "Choose Location on Map";
        
        By textfield = By.xpath("//input[@id='UserRequest_PickupPoint']");
        String actualtext = tng.findElementAttributes(textfield, "placeholder");
        System.out.println("the actual text is "+actualtext);
        softassert.assertEquals("They are same", expectedtext, actualtext);
        System.out.println("Verifying text");
        tng.quitScreen();
        System.out.println("Closing the screen");
        //this statement is used to verify if there is any failure in the code that should be reported.
        softassert.assertAll();
        
        
    }
//    @AfterTest
//    public void stopBrowser(){
//       
//        tng.quitScreen();
//    }
    
    
    
}
