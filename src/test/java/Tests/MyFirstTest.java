package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        List<WebElement> list1 = driver.findElements(By.xpath("//p"));
        for (WebElement item : list1
        ) {
            System.out.println(item.getText());
        }}
        @Test
     public void secondTest(){
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            List<String>list2=new ArrayList<>();
            list2.add("https://www.youtube.com/watch?app=desktop&v=N8Rr7rVf1RA");
            list2.add("https://chromedriver.chromium.org/downloads");
            list2.add("https://www.google.by/");
            list2.add("https://www.instagram.com/?hl=ru");
            list2.add("https://www.facebook.com/");
         for (int i=0;i<5;i++){driver.get(list2.get(i));

         }

        }



    }



