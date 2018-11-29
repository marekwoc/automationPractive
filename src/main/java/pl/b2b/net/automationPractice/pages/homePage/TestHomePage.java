package pl.b2b.net.automationPractice.pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.automationPractice.SingletonWebDriver;

public class TestHomePage {

        private SingletonWebDriver singletonWebDriver;
        private WebDriver webDriver;
        private WebDriverWait wait;
        private ObjectHomePage objectHomePage;

    @BeforeClass
    private void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectHomePage = new ObjectHomePage(webDriver, wait, womenPage, categoriesList);

    }

    @Test (priority = 1)
    public void openStore (){
        webDriver.get(DataHomePage.URL);
        Assert.assertEquals(webDriver.getTitle(),"My Store");
    }

    @Test (priority = 2)
    public void gotoWomenPage (){
        objectHomePage.clickWomenPage();
        Assert.assertEquals(webDriver.getTitle(),"Women - My Store");
    }
    @Test
    public void gotoCategoryDresses (String name){
        objectHomePage.clickCategories(name);
        Assert.assertTrue(webDriver.getTitle().contains("Dresses"));
    }
    @Test
    public void gotoCategoryWomen (String name){
        objectHomePage.clickCategories(name);
        Assert.assertTrue(webDriver.getTitle().contains("Women"));
    }
    @Test
    public void gotoCategoryTshirt (String name){
        objectHomePage.clickCategories(name);
        Assert.assertTrue(webDriver.getTitle().contains("T-shirts"));
    }

//@AfterClass
//    public void tearUp(){
//        webDriver.quit();
//}
}
