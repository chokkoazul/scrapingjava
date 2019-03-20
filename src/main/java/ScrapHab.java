import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class ScrapHab {

    public static void main( String[] args )
    {
        File file = new File("/home/cristian.osorio/BackProjects/scrapingjava/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.afphabitat.cl/portalPrivado_FIXWeb/public/login.htm");
        driver.findElement(By.id("j_username_input")).sendKeys("160768908");;
        driver.findElement(By.id("j_password")).sendKeys("252308");;
        driver.findElement(By.id("button")).click();
        System.out.println(driver.findElement(By.tagName("body")).getText());

        String a = driver.findElement(By.cssSelector("[span]")).getText();


        List<WebElement> linkElements = driver.findElements(By.cssSelector("monto-ahorrado"));



       // WebElement webElement = ((ChromeDriver) driver).findElementByCssSelector("#result-box");

//        List pElements = driver.findElements(By.tagName("span"));
        //WebElement webElement2 = driver.findElement(By.className("monto-ahorrado"));
 //       System.out.println("Mi saldo es de ..."+driver.findElement(By.id("habitat-private")).getText());
  //      String h1Element = driver.findElement(By.tagName("span")).getText();
   //     WebElement ele = driver.findElement(By.className("ht-ahorrado"));

        //System.out.println("Mi saldo es de ..."+driver.findElement(By.cssSelector("span[class=monto-ahorrado]")).getText());

        driver.close();

    }

}



