package pages;

import com.google.common.base.Function;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SecondPage {

    private final WebDriver driver;

    @FindBy(css = "#ui-accordiontab-3")
    private WebElement perso;

    public SecondPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void waitAccordion(final WebElement perso){
        Wait wait = new WebDriverWait(driver, 1);
        wait.until(new Function() {
            public WebElement apply(Object driver) {
                if(perso.getLocation().x < 0 || perso.getLocation().y <0)
                    return null;
                else
                    return perso;
            }
        });
    }

    public ProductMIR clickonPerso() {
        waitAccordion(perso);
        perso.click();
        return new ProductMIR(driver);
    }

}
