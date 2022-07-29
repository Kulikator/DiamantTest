package API;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(DataProviderRunner.class)
public class DiamantApiPage {

    @Before
    public void setUp() {
        RestAssured.baseURI= "https://diamant.dev.sokolov.io";
    }

    @DataProvider
    public static Object[][] testData() {
        return new Object[][]{
                {"/api/page?slug=main"},
                {"/api/page?slug=blagovest"},
                {"/api/page?slug=brand"},
                {"/api/page?slug=partners"},
                {"/api/page?slug=promo"},
                {"/api/page?slug=present"},
        };
    }

    @DisplayName("Проверка работы API получения страниц")
    @Test
    @UseDataProvider("testData")
    public void getPageStatusCode(final String pageName) {
        given()
                .get(pageName)
                .then().statusCode(200).and().assertThat().body("blocks", notNullValue());
    }
}
