import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

    private static WebDriver driver = null;
    
    public void run() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\java projects\\chromedriver.exe");
        for (int i = 0; i < 10; i++) {
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.id("email")).sendKeys("fb.ha.nguyen.k10" + "@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("hanguyenk10");
            Thread.sleep(1000);
            driver.findElement(By.id("loginbutton")).click();
            Thread.sleep(1000);
            driver.get("https://www.facebook.com/cawtsphim/videos/1254957844572314/");
            Thread.sleep(1000);
            WebElement xxx = driver.findElement(By.xpath("//div[@class='__ji _2cx6']"));
            System.out.println(xxx.isDisplayed());
            xxx.click();
            Thread.sleep(1000);
            WebElement element = driver.findElement(By.cssSelector(".UFILikeLink._4x9-._4x9_._48-k"));
            Actions actions = new Actions(driver);
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("scroll(0, 250)"); // if the element is on bottom.
            WebElement e = driver.findElement(By.cssSelector(".UFILikeLink._4x9-._4x9_._48-k"));
            System.out.println(e.isDisplayed());
            e.click();
            driver.close();            
            Thread.sleep(1000);
        }
        
        
//        for (int k = 1; k < 40; k++) {
//            driver.findElement(By.xpath("//*[@name='answer[" + k + "]'][@value='" + 1 + "']")).click();
//            driver.findElement(By.className("btn")).click();
//        }
//        driver.findElement(By.xpath("//*[@name='answer[40]'][@value='" + 1 + "']")).click();
//        driver.findElement(By.name("bsubmit")).click();
    }


    public static void main(String[] args) throws InterruptedException {
        new Login().run();
    }

}
