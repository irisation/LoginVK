package core;

import helpers.WebDriverSingleton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static final String BASE_URL = "http://vk.com";

    @BeforeMethod
    public void setup() throws InterruptedException {
        String browser = System.getProperty("browser", "firefox");
        WebDriverSingleton.initDriver(browser).get(BASE_URL);
    }

    @AfterMethod
    public void teardown() {
        WebDriverSingleton.getDriver().quit();
    }

}
