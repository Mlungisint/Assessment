package AssesOneUI;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
    WebDriver driver;

    @Test
    public void Setup() {

        System.setProperty("webdriver,chomee.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

        driver=new ChromeDriver();


        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Michael Jackson");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();

        String tittle= driver.getCurrentUrl();

        if (tittle.contains("Michael jackosn")) {
            System.out.println("Pass");
        }else {
            System.out.println("Test fail");
        }
    }





}
