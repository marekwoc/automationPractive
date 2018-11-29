package pl.b2b.net.automationPractice.pages.topsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ObjectTopsPage {


    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectTopsPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath = DataTopsPage.TOPS_ASSERT)
    private WebElement topsAsser;

    @FindAll(@FindBy(xpath = DataTopsPage.TOPS_PROD_LIST))
    private List<WebElement> lista;

    public WebElement getTopsAsser() {
        return topsAsser;
    }
    public int getSizeList(){
        return lista.size();
    }

}
