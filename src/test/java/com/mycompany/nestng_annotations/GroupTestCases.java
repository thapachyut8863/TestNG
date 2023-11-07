/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nestng_annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Dell
 */
public class GroupTestCases{
    
    @Test(groups="function")
    public void Test1(){
            System.out.println("this is test 1");
    }
    @Test(groups="function")
    public void Test2(){
            System.out.println("this is test 2");
    }
    @Test(groups="system")
    public void Test3(){
            System.out.println("this is test 3");
    }
    @Test(groups= {"system","function"})
    public void Test4(){
            System.out.println("this is test 4");
    }
    
}
