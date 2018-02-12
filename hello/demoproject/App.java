package com.demo.demoproject;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try{
           
          String endPoint = "https://apigateway.poc.wrsops.net/v1/oauth2/token";
          String clientId = "f12f294c-e360-483b-b353-f87a07a68bef";
          String clientSecret = "~G2n1if_fTqD";
          String redirectURI = "https://api.sandbox.onemarketnetwork.com/v1/oauth2/token/"; //Your IAM Redirect URI 
          String scope = "retailer.orders.write retailer.orders.read retailer.users.write retailer.users.read"; //Scope for maintaining transaction
          
          OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
          OAuthClientRequest accesstoken_request;
              accesstoken_request = OAuthClientRequest.tokenLocation(endPoint)
                      .setGrantType(GrantType.CLIENT_CREDENTIALS).setClientId(clientId)
                      .setClientSecret(clientSecret).
                      setScope(scope).buildBodyMessage();
                      
          System.out.println("........"+accesstoken_request);
          
          OAuthJSONAccessTokenResponse response = oAuthClient.accessToken(accesstoken_request);
          System.out.println(response.getBody());
          
          
          
        } catch (OAuthSystemException e) {
          e.printStackTrace();
        } catch (OAuthProblemException e) {
          e.printStackTrace();
        }  
        
    }
}
