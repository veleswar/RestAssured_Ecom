import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import pojo.ProductBody;

import java.io.File;

import static io.restassured.RestAssured.*;

public class CreateProduct {

    public static ProductBody createProduct(String token, String userId)
    {


        RequestSpecification prodSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization",token).build();


        RequestSpecification AddProduct = given().log().all().spec(prodSpec).param("productName","Laptop")
                .param("productAddedBy",userId)
                .param("productCategory","fashion")
                .param("productSubCategory","shirts")
                .param("productPrice",111500)
                .param("productDescription","Mackbook")
                .param("productFor","All")
                .multiPart("productImage",new File("src/main/java/Files/macbook.jpeg")) ;

      ProductBody addProduct =  AddProduct.when().post("api/ecom/product/add-product").then().log().all().extract().response().as(ProductBody.class);
      return addProduct;


    }
}
