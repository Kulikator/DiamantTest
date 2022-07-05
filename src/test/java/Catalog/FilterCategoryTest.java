package Catalog;

import PageObject.ArticleCard;
import PageObject.CatalogPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static PageObject.CatalogPage.DIAMANT_CATALOG;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.containsString;

public class FilterCategoryTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";
        CatalogPage catalogPage = open(DIAMANT_CATALOG, CatalogPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        catalogPage.cardsWaiting();
    }

    @DisplayName("Работа фильтра 'Категория', название категории должно быть в названии артикула")
    @Test
    public void filtersCategoryCheck() {
        CatalogPage catalogPage = page(CatalogPage.class);
        ArticleCard articleCard = page(ArticleCard.class);
        String filterName;
        String artName;

        for(int i = 0;i<10;i++){
            catalogPage.choseFilterCategoryClick(i);
            filterName = catalogPage.getActiveFilterName();
            catalogPage.artInCatalogClick(1);
            articleCard.waiter();
            artName = articleCard.getArticleName();
            back();
            catalogPage.loaderCatalogWaiting();
            collector.checkThat(artName, containsString(filterName));
        }
    }
}
