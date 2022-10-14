package com.juaracoding.AhlanRezki;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PostTestAhlanRezki {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp SQA\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //input first name
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Ahlan");
        System.out.println("input first name");
        delay(1);

        //input last name
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Rezki");
        System.out.println("input last name");
        delay(1);

        //input job title
        driver.findElement(By.xpath("//*[@id=\"job-title\"]")).sendKeys("QA Engineer");
        System.out.println("input last name");
        delay(1);

        //pilih Highest level of education dari radio button
        driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]")).click();
        System.out.println("Highest level of education is Collage");
        delay(1);

        //pilih checkbox sex
        driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")).click();
        System.out.println("Sex is Male");
        delay(1); // delay per event

        //untuk scrol
        js.executeScript("window.scrollBy(0,500)");
        delay(1);

        //pilih dari dropdownlist
        WebElement elementSelect = driver.findElement(By.id("select-menu"));
        Select selectmenu = new Select(elementSelect);
        selectmenu.selectByIndex(1);
        delay(1);

        //pilih date dari datepicker
        WebElement sendate = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        // method untuk memilih tanggal
        sendate.sendKeys("01/11/2022");
        System.out.println("Date 01-January-2022");

        //Klik button submit
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        System.out.println("Button Submit clicked");

        delay(5);
        driver.quit();
    }

    static void delay(int detik){

        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
