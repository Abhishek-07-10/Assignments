package com.wetherforecast;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class App {

    public static void main(String[] args) {
        try {
            callweatherforecastapp();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void callweatherforecastapp() throws Exception {
        URIBuilder builder = new URIBuilder("https://api.weatherbit.io/v2.0/current");

        builder.setParameter("lat", "35.7796");
        builder.setParameter("lon", "-78.6382");
        builder.setParameter("key", "411a845b0fda4e84874ab7920803c4b8");
        builder.setParameter("include", "minutely");

        HttpGet getData = new HttpGet(builder.build());
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = client.execute(getData);
        
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity rentity = response.getEntity();
            String rres = EntityUtils.toString(rentity);
            System.out.println(rres);
        }else{
            throw new Exception();
        }
        client.close();
    }
}
