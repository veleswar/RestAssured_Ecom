import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.AuthBody;
import pojo.LoginResponse;

import static io.restassured.RestAssured.given;

public class AuthToken {
    public static LoginResponse authToken()
    {
      RequestSpecification req =  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
              .setContentType(ContentType.JSON).build();

        AuthBody authBody = new AuthBody();
        authBody.setUserEmail("viswasales90@gmail.com");
        authBody.setUserPassword("Postman123");

        RequestSpecification reqAuth = given().spec(req).body(authBody);
        LoginResponse loginResponse= reqAuth.when().post("/api/ecom/auth/login").then().extract().response().as(LoginResponse.class);
        return loginResponse;
    }
}
