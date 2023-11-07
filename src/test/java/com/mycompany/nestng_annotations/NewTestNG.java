/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nestng_annotations;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Dell
 */
public class NewTestNG {
    TestNGMethods tng = new TestNGMethods(null);
    @BeforeTest
    public void Setup(){
        tng.browserSetUp();
          tng.getURl("http://192.168.20.149:8013/");
        tng.screenMaximize();
        tng.implicitWait();
      
       
    }
    @Test(description="This is the test to check the current title matches to our test title")
    public void testTitle(){
        String expectedTitle = "Vehicle Management - Vehicle Management";
        String actualTitle = tng.getCurrentTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        
    }
    @AfterTest
    public void QuitSetUp(){
        tng.quitScreen();
    }
    
    
    
    
    
}
