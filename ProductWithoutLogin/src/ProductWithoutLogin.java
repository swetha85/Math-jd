import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.runner.JUnitCore.runClasses;

public class ProductWithoutLogin {
    static WebDriver driver = new ChromeDriver();


    @BeforeClass
    public static void setup() {
        System.out.println("BeforeClass  --  setup");
        driver.get("http://localhost:8080");
}
@Test
public void productWithoutLogin(){
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".row > li:nth-child(2) > a")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
    driver.findElement(By.xpath("//li[3]/a/span")).click();
   /* driver.findElement(By.xpath("//a[@class='dropdown-toggle']//i[@class='fa fa-shopping-basket mr-5']")).click();
    driver.findElement(By.xpath("//a[@class='pull-right']")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
    */driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
}
}
