package com.selenium.rnd;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RequiredFields {

    public static void main(String[] args) {


        WebDriver driver = BrowserClass.instanceOfBrowserClass().getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://wet-boew.github.io/v4.0-ci/demos/formvalid/formvalid-en.html");
        List<WebElement> webElements = null;
        try {
             webElements = driver.findElements(By.xpath(".//*[@required='required' and @type ='checkbox']"));
            System.out.println("Size " + webElements.size());
        } catch (Exception e) {
            System.out.println("1E************");
        }


        for (WebElement wb : webElements) {


            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,550)");


                int i = 0;

                do {
                    try {

                        if ( wb.isDisplayed()) {
                            System.out.println(wb.getAttribute("type"));
                            i = i + 1;
                            Thread.sleep(1000);
                            wb.findElement(By.xpath(".//*[@value='1']")).click();
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("E************");

                    }
                } while (i == 0);


            }


        }
    }

