package suraj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {
    public static void main(String[] args){
        // System.setProperty("webdriver.gecko.driver", "/home/suraj/Desktop/code/selenium-java/demo/src/geckodriver");
        // System.setProperty("webdriver.chrome.driver", "/home/suraj/Desktop/code/selenium-java/demo/src/chromedriver");
        System.setProperty("webdriver.edge.driver", "/home/suraj/Downloads/driver/edgedriver_linux64/msedgedriver");
		// WebDriver driver = new FirefoxDriver();
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
    }
    
}
