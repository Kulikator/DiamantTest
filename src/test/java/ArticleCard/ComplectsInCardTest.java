package ArticleCard;

import PageObject.ArticleCard;
import PageObject.CatalogPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.Randomizer;
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static PageObject.CatalogPage.DIAMANT_CATALOG_COMPLECTS;
import static com.codeborne.selenide.Selenide.*;

public class ComplectsInCardTest {

    @Before
    public void setUp() throws InterruptedException {
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";

        CatalogPage catalogPage = open(DIAMANT_CATALOG_COMPLECTS, CatalogPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        catalogPage.loaderCatalogWaiting();
        catalogPage.artInCatalogClick(Integer.parseInt(RandomStringUtils.randomNumeric(1)));
    }

    @DisplayName("Проверка отображения комплектных изделий")
    @Test
    public void countComplectsCheck(){
        ArticleCard articleCard = page(ArticleCard.class);
        int countComplect = articleCard.complectCountFromBanner();
        articleCard.bannerComplectClick();
        articleCard.complectCardsWaiting();
        Assert.assertEquals(countComplect, articleCard.sizeOfComplectCards());
    }

    @Test
    public void complectClickTest() throws InterruptedException {
        ArticleCard articleCard = page(ArticleCard.class);
        articleCard.bannerComplectClick();
        articleCard.complectCardsWaiting();

        for (int i = 0; i < articleCard.sizeOfComplectCards(); i++){
            String comPrice = articleCard.getComplectCardPrice(i);
            articleCard.complectArtClick(i);
            articleCard.waiter();
            Thread.sleep(5000);
            Assert.assertEquals(comPrice, articleCard.getArticlePrice());
            back();
            articleCard.waiter();
            articleCard.bannerComplectClick();
            articleCard.complectCardsWaiting();
        }

    }
}
