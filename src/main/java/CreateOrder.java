import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.OrderDetails;
import pojo.Orders;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CreateOrder {

    public static String orderCreation(String token,String productId)
    {
        RequestSpecification oc = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .setContentType(ContentType.JSON).addHeader("authorization",token).build();

        OrderDetails orderDet = new OrderDetails();
        orderDet.setCountry("India");
        orderDet.setProductOrderedId(productId);
        List<OrderDetails> orderDetailList = new ArrayList<OrderDetails>();
        orderDetailList.add(orderDet);

        Orders orders = new Orders();
        orders.setOrders(orderDetailList);


        RequestSpecification createOrderSpec = given().log().all().spec(oc).body(orders);
        String createOrder = createOrderSpec.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
        return createOrder;
    }

}
