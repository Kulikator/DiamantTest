package Catalog;

import PageObject.ArticleCard;
import PageObject.CatalogPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.checkerframework.checker.units.qual.A;
import org.junit.Before;
import org.junit.Test;

import static PageObject.CatalogPage.DIAMANT_CATALOG;
import static com.codeborne.selenide.Selenide.*;

public class ShowMoreButtonClickTest {

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browserSize = "1920x1920";
        Configuration.browser = "Chrome";
        CatalogPage catalogPage = open(DIAMANT_CATALOG, CatalogPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        catalogPage.cardsWaiting();
    }

    @Test
    public void showMoreButtonClickMaxCount() {
        CatalogPage catalogPage = page(CatalogPage.class);
            catalogPage.buttonShowMoreClick(2);
    }
}

