package Catalog;

import PageObject.CatalogPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static PageObject.CatalogPage.DIAMANT_CATALOG;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

@RunWith(DataProviderRunner.class)
public class SearchJewelryTest {
    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";
        CatalogPage catalogPage = open(DIAMANT_CATALOG, CatalogPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        catalogPage.cardsWaiting();
    }
    @DataProvider
    public static Object[][] testData() {
        return new Object[][]{
                {"Серьги"},
                {"Кольца"},
                {"Браслеты"},
                {"Подвески"},
                {"Цепи"},
                {"Броши"},
                {"Колье"},
                {"Пирсинг"},
                {"Запонки"},
                {"Брелоки"},
                {"Бриллиант"},
                {"Сапфир"},
                {"Агат"},
                {"Серьги золотые"},
                {"Серьги серебряные"},
        };
    }
    @DisplayName("Работа поиска + открытие карточки товара")
    @Test
    @UseDataProvider("testData")
    public void workOfSearch(final String searchText) {
        CatalogPage cp = page(CatalogPage.class);
        cp.inputSearchSendKeys(searchText);
        cp.loaderSearchWaiting();
        cp.showAllClick();
    }
}
