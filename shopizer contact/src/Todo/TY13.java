package Todo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TY13 {
    static WebDriver driver = new ChromeDriver();


    @BeforeClass
    public static void setup(){
        System.out.println("BeforeClass  --  setup");
        driver.get("http://localhost:8080");

    }
    @Test
    public void contactUs(){
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".footer-wrapper:nth-child(1) > .usefull-link > li:nth-child(2) > a")).click();
        //driver.findElement(By.xpath("//div[2]/div/div/ul/li[2]/a")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("swetha");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swethasayapuraju@outlook.com");
        driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("vintage bag");
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("change in colour");
        driver.findElement(By.xpath("//input[@id='submitContact']")).click();

    }


    @AfterClass
    public static void close() {
        System.out.println("AfterClass close");
        driver.close();
    }
}
