package com.api.methods;

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

  class BaseClass {

public static  String d ="Rahul";
      public static void main(String  [] args ) {

        d ="rrr";
        System.out.println("@@@"+ d);
          WebDriver driver = new ChromeDriver();
        Instant start = Instant.now();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://in.yahoo.com/");
  }


//
////   public static void main(String args[]) {
////
////        System.setProperty("webdriver.chrome.driver", "/Users/rahulpiprade/Downloads/SeleniumLearnings/chromedriver");
////        WebDriver driver = new ChromeDriver();
////        Instant start = Instant.now();
////        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////        driver.get("https://in.yahoo.com/");
////        WebDriverWait wait = new WebDriverWait(driver,30);
//////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Enroll Your Self']")));
//////        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[text()='Enroll Your Self']"))).click();
////       driver.findElement(By.xpath(".//*[text()='Mail']")).click();
////      Set<String> handles = driver.getWindowHandles();
////
////
////
////
////        Instant finish = Instant.now();
////
////        long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
////        System.out.println("Time" + timeElapsed);
////        driver.close();
////        // Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//////                .withTimeout(30, TimeUnit.SECONDS)
//////                .pollingEvery(5, TimeUnit.SECONDS)
//////                .ignoring(NoSuchElementException.class);
//////
//////        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//////            public WebElement apply(WebDriver driver) {
//////                return driver.findElement(By.id("foo"));
//////            }
//////        });
////
////// String s1 = "Rahul";
//////        String s2 = "Rahul";
//////        String s3 = new String("Rahul");
//////        String s4 = new String("Rahul");
//////
//////        System.out.println(s1==s2);
//////        System.out.println(s1.equals(s2));
//////        System.out.println(s1==s3);
//////        System.out.println(s1.equals(s3));
////
////
////    }
////public  void run (){
////        System.out.println("Parent class method ");
////}
//
//
//}
//
//class Childclass extends BaseClass {
//    public  void run (){
//        System.out.println("Child class method**************");
//       d ="rrr";
//        System.out.println("@@@"+ d);
//    }
//
//        }
//class Normal {
//    public static void main(String args[]) {
//    BaseClass b = new Childclass();
//    b.run();
//        ArrayList a = new ArrayList();
//        a.add(1);
//        a.add(2);
//
//        int i = Integer.parseInt(a.get(1).toString());
//
//        d ="rrr";
//        System.out.println("@@@"+ d);
//    }
}