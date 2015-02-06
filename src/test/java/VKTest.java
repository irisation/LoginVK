import core.TestBase;
import helpers.Waiter;
import helpers.WebDriverSingleton;
import junit.framework.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WallPage;

public class VKTest extends TestBase {
    public static final String WALLTEXT = "test11";

    @Test
    public void loginAndPostTest() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(WebDriverSingleton.getDriver(), LoginPage.class);
        loginPage.login("testuse1@tut.by", "testuser1");
        WallPage wallPage = PageFactory.initElements(WebDriverSingleton.getDriver(), WallPage.class);
        wallPage.post(WALLTEXT);
        Waiter.waitForJavascriptFinished(WebDriverSingleton.getDriver());
        Assert.assertEquals(WALLTEXT, wallPage.lastWallText.getText());
        wallPage.lastWallTextDeleteButton.click();
        Waiter.waitForJavascriptFinished(WebDriverSingleton.getDriver());
        Assert.assertFalse(wallPage.lastWallText.isDisplayed());

    }
}
