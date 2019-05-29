package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {

    private final WebDriver driver;

    @FindBy (css = "#username")
    private WebElement loginString;

    @FindBy (css = "#password")
    private WebElement passwordString;

    public StartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void insertLogin (String login) {
        loginString.click();
        loginString.sendKeys(login);
    }

    public void insertPassword (String password) {
        passwordString.click();
        passwordString.sendKeys(password);
        passwordString.sendKeys(Keys.ENTER);
    }

    public SecondPage autorisation() {
        return new SecondPage(driver);
    }

}
