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
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.containsString;

public class MultipleCheckBoxFilterTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browserSize = "1920x1600";
        Configuration.browser = "Chrome";
        CatalogPage catalogPage = open(DIAMANT_CATALOG, CatalogPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        catalogPage.cardsWaiting();
    }

    @DisplayName("Работа чек-бокс фильтров")
    @Test
    public void multipleCheckBoxFiltersWork(){
        CatalogPage catalogPage = page(CatalogPage.class);
        catalogPage.clickAllButtonsShowMoreForFilters();
        catalogPage.choseCheckBoxFilterByRandom();
        collector.checkThat(catalogPage.getInsertsOfFirstArt(), containsString(catalogPage.getTextOfFirstActiveFilter()));
    }
}
