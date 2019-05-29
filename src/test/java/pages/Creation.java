package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Creation {

    private final WebDriver driver;

    @FindBy (xpath = "//*[contains(text(), 'Дебетовые продукты')]")
    private WebElement groupofProducts;
    @FindBy (xpath = "//*[contains(text(), 'Предоплаченные продукты')]")
    private WebElement groupofProductsClick;

    @FindBy (xpath = "//*[contains(text(), 'Предоплаченная карта')]")
    private WebElement Products;
    @FindBy (xpath = "//*[contains(text(), 'Предоплаченная Карта Привилегия Плюс')]")
    private WebElement ProductsClick;

    @FindBy (xpath = "//*[contains(text(), 'Дуальный')]")
    private WebElement interfaceMir;
    @FindBy (xpath = "//*[contains(text(), 'Бесконтактный')]")
    private WebElement interfaceMirClick;

    @FindBy (xpath = "//*[contains(text(), 'Карта с вырубкой')]")
    private WebElement formFactor;
    @FindBy (xpath = "//*[contains(text(), 'Карта')]")
    private WebElement formFactorClick;

    @FindBy (xpath = "//*[contains(text(), 's (0002)')]")
    private WebElement currency;
    @FindBy (xpath = "//*[contains(text(), 'EUR (0978)')]")
    private WebElement currencyClick;

    public Creation (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public Choose chooses(){
        groupofProducts.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        groupofProductsClick.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        Products.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        ProductsClick.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        interfaceMir.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        interfaceMirClick.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        formFactor.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        formFactorClick.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        currencyClick.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        currencyClick.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        return new Choose(driver);
    }


}
