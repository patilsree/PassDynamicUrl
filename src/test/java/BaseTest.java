import org.junit.After;
import org.junit.Before;

/**
 * Created by Yogesh on 16-11-2016.
 */
public class BaseTest  extends BasePage{


    BasePage basePage = new BasePage();


 @Before
    public void setUp()
    {
        basePage.openBrowser();
    }



@After
    public void tearDown()
    {
basePage.closeBrowser();
    }

}
