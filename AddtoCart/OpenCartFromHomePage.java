package AddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenCartFromHomePage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[2]/a")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("Saket@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("Saket@123");
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[4]/a/span")).click();


    }}