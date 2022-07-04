package Catalog;

import PageObject.CatalogPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static PageObject.CatalogPage.DIAMANT_CATALOG;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static java.lang.Thread.sleep;

public class ViewCatalogWithoutInfoTest {

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";
        CatalogPage catalogPage = open(DIAMANT_CATALOG, CatalogPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        catalogPage.cardsWaiting();
    }

    @DisplayName("Отображение каталога без описания")
    @Test
    public void viewCatalogWithoutInfo() throws InterruptedException {
        CatalogPage catalogPage = page(CatalogPage.class);
        catalogPage.setViewWithoutInfoClick();
        catalogPage.viewCatalogCheck();
    }

}
