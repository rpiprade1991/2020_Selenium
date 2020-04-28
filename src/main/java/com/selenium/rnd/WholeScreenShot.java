package com.selenium.rnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WholeScreenShot {


    public static void main(String args[]) {


        WebDriver driver = null;
        try {
            System.setProperty("webdriver.chrome.driver", "/Users/rahulpiprade/Downloads/SeleniumLearnings/chromedriver");
            driver = new ChromeDriver();
        } catch (WebDriverException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.webpagetest.org");

        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(), "jpg", new File("/Users/rahulpiprade/Downloads/SeleniumLearnings/src/main/Fullimage.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();


    }
}