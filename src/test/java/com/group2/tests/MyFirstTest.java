package com.group2.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    //@Parameters({"name"})
    public void loginTest(String name){
        System.out.println("Login to store");
        boolean loginResult = name.equals("marina")?true:false;
        Assert.assertTrue(loginResult, "Unable to login to store.");
    }

    @Test
    public void loginInvaloidCredsTest(){
        System.out.println("Login to store with invalid creds");

    }

}
