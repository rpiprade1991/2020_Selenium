package com.selenium.rnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClass {

    private static BrowserClass instanceOfBrowserClass =null;
    private WebDriver driver;

    private BrowserClass(){
        System.setProperty("webdriver.chrome.driver", "/Users/rahulpiprade/Downloads/SeleniumLearnings/chromedriver");
        driver = new ChromeDriver();
    }

    public static BrowserClass instanceOfBrowserClass(){
  if (instanceOfBrowserClass==null){
      instanceOfBrowserClass = new BrowserClass();
  }
  return instanceOfBrowserClass;
    }

    public WebDriver getDriver(){
        return driver;
    }
}
