package API;

import ApiData.ApiRequests;

import Product_POJO.Product;
import io.restassured.response.Response;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;


public class DiamantApiProductTest {
    ApiRequests apiRequests = new ApiRequests();

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void getProductDiamantApiTest(){
      Response response =  apiRequests.getProductDiamantResponse("94-310-00839-1");
        response.then().assertThat().body("data.type", equalTo("product-card"));
                /*.and().assertThat().body("data.attributes.type",equalTo("diamant-jewelry-catalog"))
                .and().assertThat().body("data.attributes.breadcrumb", is(not(Collections.emptyList())))
                .and().assertThat().body("data.attributes.photos",is(not(Collections.emptyList())))
                .and().assertThat().body("data.attributes.characteristic.inserts",is(not(Collections.emptyList())))
                .and().assertThat().body("data.attributes.type", equalTo("diamant-jewelry-catalog"))
                .and().assertThat().body("data.attributes.name", is(not("")))
                .and().assertThat().body("data.attributes.price", notNullValue())
                .and().assertThat().body("data.attributes.characteristic.zodiac", equalTo(null));*/
    }

    @Test
    public void breadcrumbsCheck(){
        Product product =  apiRequests.getProductDiamant("94-310-00839-1");
        if(product.getBreadcrumbs().size() == 0){
            collector.addError(new Throwable("Пустой массив хлебных крошек"));
        }
    }
    @Test
    public void insertsCheck(){
        Product product =  apiRequests.getProductDiamant("94-310-00839-1");
        if(product.getInsertsList().size() == 0){
            collector.addError(new Throwable("Пустой массив вставок у изделия с вставками"));
        }
        collector.checkThat(product.getInsertsTypeById(0),equalTo("Чароит"));
    }

    @Test
    public void basicCharactersOfProduct(){
        Product product =  apiRequests.getProductDiamant("95-110-00377-1");
        collector.checkThat(product.getWeight(),notNullValue());
        collector.checkThat(product.getMetalColour(),notNullValue());
        collector.checkThat(product.getMetalProbe(),notNullValue());
    }

    @Test
    public void priceCheck(){
        Product product =  apiRequests.getProductDiamant("95-310-00973-1");
        collector.checkThat(product.getPrice(),notNullValue());

    }


}
