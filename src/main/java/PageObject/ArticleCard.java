package PageObject;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static java.lang.Thread.sleep;
import static java.time.Duration.ofSeconds;

public class ArticleCard {

    //Название артикула
    @FindBy(how = How.CSS, using = ".product-info__title")
    private SelenideElement articleName;

    //Многоточие хлебных крошек
    @FindBy(xpath = ".//button[@class='breadcrumbs__btn']")
    private SelenideElement breadcrumbsDots;

    //коллекция хлебных крошек
    @FindBy(css = ".breadcrumbs__link.breadcrumbs__link--isOpen")
    private ElementsCollection breadcrumbsCollection;

    @FindBy(xpath = ".//span[text()='Описание']")
    private SelenideElement descriptionButton;

    @FindBy(xpath = ".//span[text()='Комплект']")
    private SelenideElement complectButton;

    //Кнопка с информацией о комплекте
    @FindBy(css = ".product-info__complement")
    private SelenideElement complectButtonBanner;

    //Коллекция всех комплектных изделий
    @FindBy(css = ".card")
    private ElementsCollection complectArts;

    @FindBy(css = ".product-info__complement-count")
    private SelenideElement infoComplectBanner;

    @FindBy(css =".product-info__price")
    private SelenideElement articlePrice;

    public String getArticleName(){
        String name = articleName.getText();
        return name;
    }

    public void waiter(){
        articleName.shouldBe(visible,ofSeconds(10)).scrollTo();
    }

    public void breadcrumbWaiter(){
        breadcrumbsDots.shouldBe(visible,ofSeconds(10));
    }


    public void BreadcrumbsDotsClick(){
        breadcrumbsDots.click();
    }

    public void breadcrumbsCollectionClick(int i){
        breadcrumbsCollection.get(i).click();
    }

    public int sizeOfBreadcrumbCollection(){
        return breadcrumbsCollection.size();
    }

    public String textOfBreadcrumb(int i ){
        return breadcrumbsCollection.get(i).getText();
    }

    public void descriptionButtonClick(){
        descriptionButton.click();
    }

    public void bannerComplectClick(){
        complectButtonBanner.click();
    }

    public void complectButtonClick(){
        complectButton.click();
    }

    public void complectArtClick(int i ){
        complectArts.get(i).click();
    }

    public int complectCountFromBanner(){
        String info = infoComplectBanner.getText();
        String count =  info.replaceAll("[^0-9]", "");
        return Integer.parseInt(count);
    }

    public int sizeOfComplectCards(){
        return complectArts.size();
    }

    public void complectCardsWaiting() {
        complectArts.get(0).shouldBe(visible,ofSeconds(20));
    }

    public String getComplectCardPrice(int i){
        return complectArts.get(i).find(By.cssSelector(".card__price")).getText();
    }

    public String getArticlePrice(){
        return articlePrice.getText();
    }

}
