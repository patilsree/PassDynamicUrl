import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Yogesh on 16-11-2016.
 */
public class BasePage {

    public String URL = System.getProperty("url");
    public String Browser= System.getProperty("browser");
    public static WebDriver driver;

public void openBrowser()
{
    if (Browser.equalsIgnoreCase("Firefox"))
    {
        driver= new FirefoxDriver();
    }else if(Browser.equalsIgnoreCase("chrome"))
    {
        System.setProperty("webdriver.chrome.driver","src/main/browser/chromedriver.exe");
        driver= new ChromeDriver();
    }
    driver.get(URL);
  //  driver.quit();
}

public void closeBrowser()
{
    driver.quit();
}


}
