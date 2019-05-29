package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Choose {

    private final WebDriver driver;


    public Choose (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
