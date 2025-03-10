package teme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EMagTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        driver = new ChromeDriver();

        driver.get("https://www.emag.ro/nav/deals?ref=hdr_ofertele-emag");

        driver.manage().window().maximize();
    }
}