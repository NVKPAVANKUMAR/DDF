package DriverInvocation;

import Utility.PropertiesUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class DriverInstance {
    public WebDriver driver;

    @BeforeTest
    public void initiateDriver() throws IOException {
        if(PropertiesUtility.fetchProperity("browser").toString().equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else if((PropertiesUtility.fetchProperity("browser").toString().equalsIgnoreCase("firefox"))){
            System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
    }

    public void openUrl(String url){
        driver.get(url);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }



}
