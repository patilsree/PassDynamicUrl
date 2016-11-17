import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Yogesh on 16-11-2016.
 */
public class e2eTest extends BaseTest {

    @Test
    public void login()
    {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("aediMNjU");
        driver.findElement(By.id("btnLogin")).click();
        Assert.assertTrue(driver.findElement(By.id("menu_pim_viewPimModule")).isEnabled());
    }

}
