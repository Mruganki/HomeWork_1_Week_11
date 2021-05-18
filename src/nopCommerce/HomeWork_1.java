package nopCommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;

public class HomeWork_1 {
        WebDriver driver;
        @Before

        public void veryfySetUpAndComputerLink() {

            String baseUrl = "https://www.google.com/";
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//it will wait to load browser
            driver.get(baseUrl);

        }
            @Test
             public void computerlink() {
                driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
                // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
                driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
                driver.findElement(By.xpath("//a[text()='Computers ']")).click();
                //driver.close();
            }
         //Testing Electronics link
           @Test
            public void electronicscheck(){

                driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
               // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
               driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
                driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
                driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
                //  driver.close();
            }
            @Test
            public void apparellink() {
                //Testing Apparel link

                driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
               // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
                driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
                driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
                //driver.close();
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
            }

            @Test
            public void digitallink(){                       //Testing Digital downloads link

                driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
              //  driver.findElement(By.xpath("//input[@value='Google Search']")).click();
                driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
                driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
                //driver.close();
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
            }

            @Test
            public void booklink() {
                //Testing Books link

                driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
               // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
                driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
                driver.findElement(By.xpath("//a[text()='Books ']")).click();
                //driver.close();
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
            }
            @Test
            public void jewelary() {
                //Testing Jewelry link

                driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
                driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
               // driver.findElement(By.xpath("//input[@value='Google Search']")).click();
                driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
                driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
                // driver.close();
                // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser
               }
                @Test
                public void giftcards () {
//            //Testing Gift Cards link

                    driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
                    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
                    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
                    //driver.findElement(By.xpath("//input[@value='Google Search']")).click();
                    driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
                    driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser                }
                }
                @After
                public void teardown () {
                    driver.quit();
                }
    }