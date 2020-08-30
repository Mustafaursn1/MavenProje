package com.techproed;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
       @AfterClass
        public static void tearDown(){
           driver.quit();

        }


        @Test
        @Ignore
    public void test1(){
        driver.get("http://www.google.com");

        //test case:Google.com'un basligi "Google Arama Sayfasi" varsayalim
       String title= driver.getTitle();

       //Google'in title "Google Arama Sayfasi" mi diye bakalim
            Assert.assertEquals("Google Arama Sayfasi","Google");
            //Assert.assertEquals()sayilari stringleri boolean'lari yazabilriz
        }

        @Test
    public void test2(){
        driver.get("http://amazon.com");

             //AMOZON.COM BASLIK "Amazon"kelimesini iceriyot olsun
            String title= driver.getTitle();
            boolean iceriyorMu=title.contains("Amazon");//true ya da false
            Assert.assertTrue(iceriyorMu);




        }
@Test
    public  void test3(){
        driver.get("https://facebook.com");
        String title= driver.getTitle();
    System.out.println("facebook Title:"+title);
        Assert.assertTrue(title.contains("YouTube")?false:true);

}
@Test
    public void test4(){
    driver.get("http://www.google.com");
    System.out.println("Hello");
    Assert.assertEquals("Google Arama Sayfasi","Google");
    //Test basarisiz ise kalan kismi calistirmiyor
    System.out.println("Test dogrulama islemi bitti");


}
@Test
    public void test5(){
    driver.get("https://facebook.com");
    String title= driver.getTitle();
    System.out.println("facebook Title:"+title);
    Assert.assertTrue(title.contains("YouTube")?false:true);
    System.out.println("Test islemi basarili");

}
}
