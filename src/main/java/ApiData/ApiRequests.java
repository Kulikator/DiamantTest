package ApiData;


import Product_POJO.Product;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiRequests extends API{

    public Product getProductDiamant(String article) {
        return given()
                .spec(apiSpecification())
                .get("/v4/catalog/product/"+article+"/")
                .then()
                .extract().body().as(Product.class);
    }

    public Response getProductDiamantResponse(String article) {
        return given()
                .spec(apiSpecification())
                .get("/v4/catalog/product/"+article+"/");

    }
}
