package AddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductInShppingCartPageFromHomePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.wait(3000);
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[2]/a")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("Saket@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("Saket@123");
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
       driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/form/div/button[1]")).click();


    }}


