package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpWithFollowValidEmailFormat {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.wait(3000);
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[1]/a")).click();
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("saket");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Shrivastava");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("@Saketgmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("Saket@123");
        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/button")).click();

    }

}
