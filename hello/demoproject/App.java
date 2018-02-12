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
           
          String endPoint = "https://........v1/oauth2/token";
          String clientId = “453453-34534-34534-34534-34534dfgfdg”;
          String clientSecret = “dfgdg345345354”;
          String redirectURI = "https://........../v1/oauth2/token/"; //Your IAM Redirect URI 
          String scope = "write read"; //Scope for maintaining transaction
          
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
