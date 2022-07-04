package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.security.PublicKey;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class DirectoryPage {

    public static final String DIRECTORY_PAGE = "https://prod.diamant.ru/directory";

    @FindBy(css = ".tabs__screen--active .page-directory__block.card-directory")
    private ElementsCollection activeDirectoryButtons;

    @FindBy(css = ".tabs__tab")
    private ElementsCollection allTabs;

    @FindBy(how = How.CSS, using = ".card")
    private ElementsCollection artCards;



    public void directoryPageWaiting(){
        activeDirectoryButtons.get(0).shouldBe(Condition.visible);
    }

    public void directoryAllClick(){
        for (int i = 1; i < allTabs.size(); i++){
            directoryButtonsClick();
            directoryPageWaiting();
            goToTop();
            allTabs.get(i).click();
        }
    }

    public void directoryButtonsClick(){
        for (int i = 0; i < activeDirectoryButtons.size(); i++){
            activeDirectoryButtons.get(i).click();
            cardsWaiting();
            back();
            directoryPageWaiting();
        }
    }

    //Ожидание загрузки артикулов
    public void cardsWaiting() {
        artCards.get(1).shouldBe(visible, Duration.ofMinutes(1));
    }

    public void goToTop(){
        executeJavaScript("window.scrollBy(0,-3000)", "");
        //$(byXpath(".//span[text()='breadcrumbs']")).scrollTo();
    }


}
