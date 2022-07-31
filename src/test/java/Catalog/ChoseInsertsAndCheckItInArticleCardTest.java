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

import java.util.Objects;

import static PageObject.CatalogPage.DIAMANT_CATALOG;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.containsString;

public class ChoseInsertsAndCheckItInArticleCardTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browserSize = "3840x2160";
        Configuration.browser = "Chrome";
        CatalogPage catalogPage = open(DIAMANT_CATALOG, CatalogPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        catalogPage.cardsWaiting();
    }

    @DisplayName("Выбираем фильтр-вставка, смотрим что у артикула по данному фильтру есть такая вставка")
    @Test
    public void multipleCheckBoxFiltersWork(){
        CatalogPage catalogPage = page(CatalogPage.class);
        ArticleCard articleCard = page(ArticleCard.class);
        for(int i = 0; i < 41; i++) {
            catalogPage.clickAllButtonsShowMoreForFilters();
            catalogPage.choseCheckBoxFilterInsertsById(i);
            String insert = catalogPage.getTextOfFirstActiveFilter();
            if (insert.contains(" ")){
                String[] str = insert.split(" ");
                insert = str[0].substring(1);
                System.out.println(insert);

            }
            catalogPage.hoverAndClickToButton(catalogPage.getCurrentArtFromPage(0));
            articleCard.waiter();
            collector.checkThat(articleCard.getInsertsOfArt(), containsString(insert));
            if(Objects.equals(articleCard.getInsertsOfArt(), "")){
                collector.checkThat(insert, containsString("ТутНеПришлаВставка"));
            }
            System.out.println(insert);
            catalogPage = open(DIAMANT_CATALOG,CatalogPage.class);
            catalogPage.loaderCatalogWaiting();
        }
        }


}
