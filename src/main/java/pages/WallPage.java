package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WallPage {
    @CacheLookup
    @FindBy(how = How.ID, using = "submit_post_box")
    private WebElement whatsNewField;

    @CacheLookup
    @FindBy(how = How.ID, using = "post_field")
    private WebElement postField;

    @CacheLookup
    @FindBy(how = How.ID, using = "send_post")
    private WebElement postButton;

    @CacheLookup
    @FindBy(how = How.XPATH, using = ".//div[@class='wall_text']/div[2]/div")
    public WebElement lastWallText;

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "post_delete_button")
    public WebElement lastWallTextDeleteButton;

    public void post(String text) {
        whatsNewField.click();
        postField.clear();
        postField.sendKeys(text);
        postButton.click();
    }

}
