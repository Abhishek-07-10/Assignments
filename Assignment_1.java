package com.example;

import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Assignment_1{
    public static void main(String[] args) {
        try {
            callApi();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void callApi() throws ClientProtocolException, IOException, URISyntaxException{
        URIBuilder builder = new URIBuilder("https://api.chucknorris.io/jokes/random");
        HttpGet getData = new HttpGet(builder.build());
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = client.execute( getData);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        System.out.println(result);
        client.close();
    }
}
