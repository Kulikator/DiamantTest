package Catalog;

import PageObject.CatalogPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static PageObject.CatalogPage.DIAMANT_CATALOG;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.is;

public class CatalogSortByPriceTest {
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

    @DisplayName("Работа сортировки")
    @Test
    public void catalogSortingByPrice() throws InterruptedException {
        CatalogPage catalogPage = page(CatalogPage.class);
        catalogPage.priceDownSortClick();
        catalogPage.loaderCatalogWaiting();
        collector.checkThat("", catalogPage.getPriceOfArtOnCatalogPage(0), is(catalogPage.getMinMaxPrice("max")));

        catalogPage.priceUpSortClick();
        catalogPage.loaderCatalogWaiting();
        collector.checkThat("", catalogPage.getPriceOfArtOnCatalogPage(0), is(catalogPage.getMinMaxPrice("min")));
    }
}
