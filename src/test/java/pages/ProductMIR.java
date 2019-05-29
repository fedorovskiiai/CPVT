package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMIR {

    private final WebDriver driver;

    @FindBy (css = "#create_profile > button > span.ui-button-text.ui-clickable")
    private WebElement createProfile;

    public ProductMIR (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public Creation clickonCreateProfile() {
        createProfile.click();
        return new Creation(driver);
    }

}
