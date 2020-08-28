package com.techproed;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {
    public static void main(String[] args) {
      //Browsserlari kullanabilmek icin
        // WebDriverManager kütüphanesini kullaniyoruz
        //System.setProperty() bunun yerine kullaniyoruz
        //Soru:WebDriverManager kütüphanesini nerden kullaniyorsun
        //cevap:sirketin verdigi kütüphaneden kullaniyoruz.
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://amazon.com");
        WebElement searcBoox= driver.findElement(By.id("twotabsearchtextbox"));
      searcBoox.sendKeys("samsung headphones"+ Keys.ENTER);

   //Keys.ENTER submit() ile ayni isi gorur
        WebElement sonucSayisi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(sonucSayisi.getText());

       WebElement ilkUrun= driver.findElement(By.xpath("//span[@dir=\"auto\"]"));
        System.out.println(ilkUrun.getText());

        List<WebElement> urunler = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        int sayi=0;
        for (WebElement w:urunler){
            System.out.println(w.getText());
            sayi++;

        }
        System.out.println(sayi);
        urunler.get(5).getText();
        urunler.size();
    }
}
