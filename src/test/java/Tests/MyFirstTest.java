package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
        }
    }
}


