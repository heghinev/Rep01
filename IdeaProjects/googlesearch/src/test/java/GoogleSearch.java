import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearch {
        private ChromeDriver driver;


        @BeforeMethod
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        @Test
        public void login(){
            driver.get("https://www.google.am");
            driver.findElement(By.id("lst-ib")).sendKeys("Armenia");
            driver.findElement(By.cssSelector("Google Search")).click();


            assertTrue("Wikipedia page is not found!",
                        driver.findElement(By.cssSelector(".r")).isDisplayed());



        }

        private void assertTrue(String s, boolean displayed) {
            //To change body of created methods use File | Settings | File Templates.
        }



        @AfterMethod
        public void tearDown(){
            driver.close();
            driver.quit();
        }

    }

}
