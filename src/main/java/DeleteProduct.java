import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class DeleteProduct {
    public static String deleteProduct(String token,String productId)
    {
        RequestSpecification deleteProdBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .setContentType(ContentType.JSON).addHeader("authorization",token).build();

        RequestSpecification deleteProductReq= given().log().all().spec(deleteProdBaseReq).pathParam("productId",productId);

        String deleteProductResponse= deleteProductReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all().extract().response().asString();

        return deleteProductResponse;
    }
}
