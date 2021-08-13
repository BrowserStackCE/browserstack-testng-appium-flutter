package com.browserstack.appium_flutter;

import io.appium.java_client.MobileElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTestClass {
    @Test
    public void basicTest () {
        String buttonFinderKey = "increment";
        MobileElement counterTextFinder = find.byValueKey("counter");
        MobileElement addButton = (MobileElement)driver.executeScript("flutter:waitFor", find.byValueKey(buttonFinderKey), 30);;
        Assert.assertEquals(counterTextFinder.getText(), "0");
        addButton.click();
        Assert.assertEquals(counterTextFinder.getText(), "1");
        addButton.click();
        Assert.assertEquals(counterTextFinder.getText(), "2");
    }
}
