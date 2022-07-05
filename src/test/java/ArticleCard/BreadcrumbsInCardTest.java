package ArticleCard;

import PageObject.ArticleCard;
import PageObject.CatalogPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.is;

public class BreadcrumbsInCardTest {

    int size;

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";
        ArticleCard articleCard = open("https://diamant.dev.sokolov.io/catalog/product/31-131-01042-1/", ArticleCard.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        articleCard.breadcrumbWaiter();
        articleCard.BreadcrumbsDotsClick();
        size = articleCard.sizeOfBreadcrumbCollection();
        refresh();

    }

    @DisplayName("Отображение хлебных крошек и переход по ним")
    @Test
    public void breadcrumbsCheck(){
        ArticleCard card = page(ArticleCard.class);
        CatalogPage catalogPage = page(CatalogPage.class);

        for(int i = 0; i < size; i++){
            card.BreadcrumbsDotsClick();
            String breadcrumbFromCard = card.textOfBreadcrumb(i);
            card.breadcrumbsCollectionClick(i);
            catalogPage.loaderCatalogWaiting();
            collector.checkThat(breadcrumbFromCard, is(catalogPage.getTextOfLustBreadcrumb()));
            back();
            card.breadcrumbWaiter();
        }
    }
}
