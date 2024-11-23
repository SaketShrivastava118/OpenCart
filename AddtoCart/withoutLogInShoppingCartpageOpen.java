package AddtoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutLogInShoppingCartpageOpen {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.wait(3000);
        driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[4]/a/span")).click();


    }}


