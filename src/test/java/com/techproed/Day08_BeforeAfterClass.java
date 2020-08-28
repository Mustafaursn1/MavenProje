package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {
   @BeforeClass//bu annotion'a sahip method her class calismadan calisir.sadece 1kere calisir
   //@Ignore calismaz @AfterClass icin de calsimaz
public static void setUp() {
       System.out.println("setUp calsiti");
   }
       @Test
      public  void test1(){
           System.out.println("test1 calsiti");
       }




   @AfterClass//sadece 1 kere calsiir
    public  static void tearDown(){
       System.out.println("tearDown calsiti");

   }
   @Test
    public  void test2(){
       System.out.println("test 2 calisti");
   }


}
