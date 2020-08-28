package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

   // @Before -->annotation her test methodundan once calsir
    //@After --> annotation her test method'dan sonra calsir

    @BeforeClass
    public static void setUp(){
        System.out.println("setUp calisti");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");

    }


    @Before
    public  void  methotdanOnce(){

        System.out.println("methotdanOnce calisti");
    }



    @Test
    public void test1(){
        System.out.println("Test 1 calisti");
    }
@Test
public void test2(){
    System.out.println("test 2 calisti");
}


    @After
    public  void methoddanSonra(){
        System.out.println("methotdan sonra calisti");
    }


}
