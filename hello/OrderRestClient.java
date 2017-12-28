package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class OrderRestClient {
  
    private static final Logger log = LoggerFactory.getLogger(OrderRestClient.class);

    public static void main(String args[]) {
      OrderRestClient app = new OrderRestClient();
      try{
        app.run();
      }catch(Exception e){
        e.printStackTrace();
      }
    }

    
    public void run() throws Exception {
          Client client = Client.create();
          
          WebResource webResource = client.resource("http://localhost:8121/orders");
          
          String order = "{\"order\":{\"orderRef\":\"2459464949-ONLINE\",\"userIdentification\":{\"retailerUserRef\":\"wmPh0sOX25h\",\"isGuest\":\"true\"},\"orderType\":\"ONLINE\",\"billingAddress\":{\"streetLines\":[\"123 Main Street\",\"Suite 45\"],\"locality\":\"San Francisco\",\"region\":\"California\",\"postalCode\":\"94127\",\"country\":\"USA\"},\"confirmationNumber\":\"string\",\"customer\":{\"title\":\"Mr\",\"firstName\":\"John\",\"middleName\":\"Paul\",\"lastName\":\"Jones\",\"email\":\"jpjones@hotmail.com\",\"gender\":\"FEMALE\",\"taxIdentificationNumber\":\"string\",\"phoneNumbers\":[\"123-456-7890\"],\"address\":{\"streetLines\":[\"123 Main Street\",\"Suite 45\"],\"locality\":\"San Francisco\",\"region\":\"California\",\"postalCode\":\"94127\",\"country\":\"USA\"}},\"optins\":[{\"channel\":\"FACEBOOK_MESSENGER\",\"feature\":\"RECEIPTS\",\"enabled\":true}],\"orderDate\":1514444921476,\"isGift\":true,\"shipment\":{\"shipmentRef\":\"string\",\"origin\":{\"streetLines\":[\"123 Main Street\",\"Suite 45\"],\"locality\":\"San Francisco\",\"region\":\"California\",\"postalCode\":\"94127\",\"country\":\"USA\"},\"destination\":{\"streetLines\":[\"123 Main Street\",\"Suite 45\"],\"locality\":\"San Francisco\",\"region\":\"California\",\"postalCode\":\"94127\",\"country\":\"USA\"},\"expectedFrom\":\"2017-10-31T16:04:46.948Z\",\"expectedUntil\":\"2017-10-31T16:04:46.948Z\",\"shippingMethod\":\"MAIL\",\"carrier\":\"UPS\",\"trackingNumber\":\"string\",\"trackingUrl\":{\"href\":\"https://retailer.onemarketnetworks.com/index.html\"},\"shipmentItems\":[{\"orderRef\":\"string\",\"orderItemRef\":\"string\",\"quantity\":0}]},\"orderItems\":[{\"orderItemRef\":\"aodn10928du\",\"product\":{\"sku\":\"string\",\"name\":\"Achilles Suede\",\"description\":\"Suede Shoes\",\"url\":{\"href\":\"https://retailer.onemarketnetworks.com/index.html\"},\"imageUrl\":{\"href\":\"https://retailerwebdemo.poc.wrsops.net/public/images/shoes_1.jpg\"},\"brands\":[\"CP\"],\"category\":[\"Shoes\"],\"logoUrl\":{\"href\":\"https://retailer.onemarketnetworks.com/index.html\"},\"manufacturer\":\"Common Projects\",\"model\":\"Achilles\",\"productIdentifier\":{\"gtin8\":\"string\",\"gtin12\":\"string\",\"gtin13\":\"string\",\"gtin14\":\"string\"}},\"quantity\":{\"quantity\":1,\"units\":\"ITEMS\"},\"unitAmount\":{\"quantity\":349,\"currency\":\"USD\"},\"taxes\":[{\"taxType\":\"REGION\",\"amount\":{\"quantity\":36,\"currency\":\"USD\"},\"rate\":0.08}],\"total\":{\"quantity\":385,\"currency\":\"USD\"},\"orderItemProperties\":[\"string\"]},{\"orderItemRef\":\"aosidj123910\",\"product\":{\"sku\":\"999\",\"name\":\"Court Leather\",\"description\":\"Leather Shoes\",\"url\":{\"href\":\"https://retailer.onemarketnetworks.com/index.html\"},\"imageUrl\":{\"href\":\"https://retailerwebdemo.poc.wrsops.net/public/images/shoes_2.jpg\"},\"brands\":[\"CP\"],\"category\":[\"Shoes\"],\"logoUrl\":{\"href\":\"https://retailer.onemarketnetworks.com/index.html\"},\"manufacturer\":\"Common Projects\",\"model\":\"Court\",\"productIdentifier\":{\"gtin8\":\"string\",\"gtin12\":\"string\",\"gtin13\":\"string\",\"gtin14\":\"string\"}},\"quantity\":{\"quantity\":1,\"units\":\"ITEMS\"},\"unitAmount\":{\"quantity\":329,\"currency\":\"USD\"},\"taxes\":[{\"taxType\":\"REGION\",\"amount\":{\"quantity\":32,\"currency\":\"USD\"},\"rate\":0.08}],\"total\":{\"quantity\":361,\"currency\":\"USD\"},\"orderItemProperties\":[\"string\"]}],\"subTotal\":{\"quantity\":678,\"currency\":\"USD\"},\"taxes\":[{\"taxType\":\"REGION\",\"amount\":{\"quantity\":68,\"currency\":\"USD\"},\"rate\":0.08}],\"total\":{\"quantity\":746,\"currency\":\"USD\"},\"paymentMethods\":[{\"paymentMethodType\":\"CARD\",\"amount\":{\"quantity\":746,\"currency\":\"USD\"},\"changeAmount\":{\"quantity\":0,\"currency\":\"USD\"},\"card\":{\"cardType\":\"VISA\",\"paymentNetworkToken\":\"EF5E3F2C65F0DF4093AA24AF9BCE3D29\",\"lastFour\":\"6789\",\"issuer\":\"string\",\"startDate\":\"0316\",\"expirationDate\":\"0319\",\"authCode\":\"string\"}}],\"status\":\"COMPLETE\",\"store\":{\"storeRef\":\"sadoi912\",\"name\":\"Common Projects\",\"address\":{\"streetLines\":[\"123 Main Street\",\"Suite 45\"],\"locality\":\"San Francisco\",\"region\":\"California\",\"postalCode\":\"94127\",\"country\":\"USA\"},\"phone\":\"123-456-7890\",\"tillRef\":\"string\"},\"localization\":{\"locale\":\"en_US\",\"timezone\":\"+08:00\"},\"delivery\":{\"deliveryEvents\":[{\"timestamp\":\"2017-10-31T16:04:46.949Z\",\"reason\":\"string\"}],\"counts\":[0]},\"orderProperties\":{\"salesPerson\":\"Sid Salesperson\",\"operator\":\"string\"}}}";

          ClientResponse response = webResource
              .type("application/json")
              .header("Retailer-Ref", "GAP_USA")
              .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIiLCJpYXQiOjE1MDk3NDUyMDYsImV4cCI6MzgxMzQyODQwNiwiYXVkIjoicG9sYXJpcyIsInN1YiI6IiIsInNjb3BlIjoicmV0YWlsZXIub3JkZXJzLnJlYWQgcmV0YWlsZXIub3JkZXJzLndyaXRlIHJldGFpbGVyLnVzZXJzLnJlYWQgcmV0YWlsZXIudXNlcnMud3JpdGUiLCJjbGllbnRfaWQiOiIyN2U2MjAyMi0zZDUyLTQ3YjEtYmI2YS1jOGY2NmY4NmI2MTYifQ.SNwFMIwOGBL68NjHj1pNwWIzWT5R5VPXCrR7xRmhxZM")
              .post(ClientResponse.class, order);
          
          log.info(response.toString());
    }
}