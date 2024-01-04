import io.restassured.path.json.JsonPath;
import pojo.LoginResponse;

public class EcomApiCalls {
    public static void main(String[] args) {
        String authToken = AuthToken.authToken().getToken() ;
        String userId  = AuthToken.authToken().getUserId() ;


        String productId = CreateProduct.createProduct(authToken,userId).getProductId();

        String orderDet = CreateOrder.orderCreation(authToken,productId) ;
        JsonPath js = new JsonPath(orderDet);
        String orderId = js.get("orders[0]");

        // Delete order
        String deleteProdResp = DeleteProduct.deleteProduct(authToken,productId) ;

        System.out.println(deleteProdResp);


//use relaxedHTTPSValidation -- for certification validation
    }
}
