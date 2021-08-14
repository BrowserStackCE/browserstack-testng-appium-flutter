package com.browserstack.appium_flutter;

import io.appium.java_client.MobileElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTestClass {
    @Test
    public void basicTest () {
        //Start Writing Test Case Here
        //driver & find is available using inheritance
        Assert.assertTrue(1==1);
    }
}
