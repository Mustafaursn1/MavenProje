package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_IsDisplayed {
    static WebDriver driver;//intance variable

    @BeforeClass
    public static void  setUp(){
        WebDriverManager.chromedriver().setup();
        //direver nesnesini tanimlayalim

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();

    }
    @Test
    public void test1(){
        //google.com'a gidiyoruz
        driver.get("http://google.com");
        WebElement googleSimge= driver.findElement(By.id("hplogo"));
        //eger webELEMENT kullaniciya gosteriliyorsa true TEST PASSED
        //gizleniyorsa false aliriz TEST FAILED
     boolean goruluyorMu=googleSimge.isDisplayed();
        Assert.assertTrue(goruluyorMu);

    }


}
