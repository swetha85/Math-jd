package recept;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MathöjdRecept {
    static WebDriver driver = new ChromeDriver();


    @BeforeClass
    public static void setup(){
        System.out.println("BeforeClass  --  setup");
        driver.get("https://www.matfrojd.com/?dev");

    }
    @Test
public void ReceptInformation() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='rn-1awozwy rn-4xf99a rn-1n0n9yc rn-1g4ueg6 rn-sj9tmm rn-1i9ubto rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-1loqt21 rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1iud8zs rn-1777fci rn-156q2ks rn-zso239 rn-15d164r rn-1n0xq6e rn-x1dlf0 rn-ifefl9 rn-pfqljz rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1otgn73 rn-lrvibr rn-1lgpqti']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'sängkantsmeny')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Kardemummakryddad mjölkdrink')]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1lgpqti']//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1g7fiml rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-11yh6sk rn-buy8e9 rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-199wky7 rn-1lgpqti']//img[@class='rn-1p0dtai rn-1pi2tsx rn-1d2f490 rn-1272l3b rn-u8s1d rn-zchlnj rn-ipm5af rn-13qz1uu rn-1wyyakw']")).click();
        driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1pi2tsx rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-97e31f rn-bv2aro rn-hxflta rn-10xqauy rn-bnwqim rn-13qz1uu rn-1lgpqti']//div[1]//div[1]//div[1]//div[1]//div[2]//img[1]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1awozwy rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1lgpqti']//div[2]//div[1]//div[1]//div[1]//div[2]//img[1]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-rull8r rn-ndvcnb rn-mm0ijv rn-gxnn5r rn-14skgim rn-fnigne rn-1efd50x rn-13yce4e rn-deolkf rn-6koalj rn-1mlwlqe rn-eqz5dr rn-1qe8dj5 rn-p1pxzi rn-11wrixw rn-61z16t rn-1mnahxq rn-ifefl9 rn-bcqeeo rn-11yh6sk rn-buy8e9 rn-1mdbw0j rn-gy4na3 rn-9aemit rn-wk8lta rn-bnwqim rn-1lgpqti']//img[@class='rn-1p0dtai rn-1pi2tsx rn-1d2f490 rn-1272l3b rn-u8s1d rn-zchlnj rn-ipm5af rn-13qz1uu rn-1wyyakw']")).click();
        driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//div[2]//img[1]")).click();

    }
    @Test
    public void FilterRecept(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='rn-1awozwy rn-4xf99a rn-1n0n9yc rn-1g4ueg6 rn-sj9tmm rn-1i9ubto rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-1loqt21 rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1iud8zs rn-1777fci rn-156q2ks rn-zso239 rn-15d164r rn-1n0xq6e rn-x1dlf0 rn-ifefl9 rn-pfqljz rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1otgn73 rn-lrvibr rn-1lgpqti']")).click();
       driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1lgpqti']//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1g7fiml rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-11yh6sk rn-buy8e9 rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-199wky7 rn-1lgpqti']//img[@class='rn-1p0dtai rn-1pi2tsx rn-1d2f490 rn-1272l3b rn-u8s1d rn-zchlnj rn-ipm5af rn-13qz1uu rn-1wyyakw']")).click();
       driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1lgpqti']//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1g7fiml rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-11yh6sk rn-buy8e9 rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-199wky7 rn-1lgpqti']//img[@class='rn-1p0dtai rn-1pi2tsx rn-1d2f490 rn-1272l3b rn-u8s1d rn-zchlnj rn-ipm5af rn-13qz1uu rn-1wyyakw']")).click();
       driver.findElement(By.xpath("//input[@placeholder='Sök kriterie här...']")).sendKeys("smoothie med variation");
       driver.findElement(By.xpath("//div[@class='rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-jwli3a rn-1471scf rn-14xgk7a rn-h1js2l rn-o11vmf rn-ebii48 rn-gul640 rn-t9a87b rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bauka4 rn-q42fyq rn-qvutc0'][contains(text(),'Filtrera')]")).click();
    }
    @Test
    public void SearchRecept(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Recept')]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1g7fiml rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-11yh6sk rn-buy8e9 rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-199wky7 rn-1lgpqti']//img[@class='rn-1p0dtai rn-1pi2tsx rn-1d2f490 rn-1272l3b rn-u8s1d rn-zchlnj rn-ipm5af rn-13qz1uu rn-1wyyakw']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Smoothie med variation')]")).click();
    }
    @Test
    public void HandlingLista(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Handlingslista')]")).click();
    }
    @AfterClass
    public static void close() {
        System.out.println("AfterClass close");
        driver.close();
    }
}
