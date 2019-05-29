import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Creation;
import pages.ProductMIR;
import pages.SecondPage;
import pages.StartPage;

import java.util.concurrent.TimeUnit;


public class MainTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setDriver() throws Exception {
        driver = new ChromeDriver();
    }

    @Before
    public void setUp() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://something.ru");
    }

    @Test
    public void entry(){
        StartPage startPage = new StartPage(driver);
        startPage.insertLogin("login@login.ru");
        startPage.insertPassword("Password");
        SecondPage secondPage = new SecondPage(driver);
        secondPage.clickonPerso();
        ProductMIR productMIR = new ProductMIR(driver);
        productMIR.clickonCreateProfile();
        Creation creation = new Creation(driver);
        creation.chooses();

    }

}
