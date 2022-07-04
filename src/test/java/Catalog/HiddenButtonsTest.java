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

public class HiddenButtonsTest {
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

    @DisplayName("Тест появления кнопки 'Подробнее' при наведении на артикул")
    @Test
    public void hiddenButtons() {
        CatalogPage catalogPage = page(CatalogPage.class);
        ArticleCard articleCard = page(ArticleCard.class);

        for (int i = 0; i < 20; i++) {
            catalogPage.hoverAndClickToButton(catalogPage.getCurrentArtFromPage(i));
            articleCard.waiter();
            back();
            catalogPage.loaderCatalogWaiting();
        }
    }
}
