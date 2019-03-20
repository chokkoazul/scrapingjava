import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Scrap {

    public static void main( String[] args )
    {
        File file = new File("/home/cristian.osorio/BackProjects/scrapingjava/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.afpcapital.cl/Paginas/login.aspx");
        driver.findElement(By.id("ctl00_ctl54_g_f7fd32f0_4643_4cde_b777_2b1c2020a2b1_ctl00_rut_completo")).sendKeys("157842994");;
        driver.findElement(By.id("ctl00_ctl54_g_f7fd32f0_4643_4cde_b777_2b1c2020a2b1_ctl00_clave_sat")).sendKeys("1289");;
        driver.findElement(By.id("ctl00_ctl54_g_f7fd32f0_4643_4cde_b777_2b1c2020a2b1_ctl00_btnIngresaPersona")).click();
        System.out.println(driver.getTitle());
        System.out.println("Mi saldo es de ..."+driver.findElement(By.id("ctl00_ctl47_g_23531470_7a95_4424_88ae_063f94826c7e_spanTotalSaldo")).getText());
        driver.close();
    }
}
