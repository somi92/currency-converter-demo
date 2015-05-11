/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.currencyconverterapp.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

/**
 *
 * @author milos
 */
public class ServiceClient {
   
    private Client client;
    
    public double getExchangeRate(String sourceCurrency, String targetCurrency) {
        
        if(client == null) {
            client = ClientBuilder.newClient();
        }
        
        WebTarget target = client.target("https://rate-exchange.herokuapp.com/")
                .path("fetchRate").queryParam("from", sourceCurrency).queryParam("to", targetCurrency);        
        
        Invocation.Builder invocationBuilder = target.request();
        Response response = invocationBuilder.get();
        
        JSONObject json = new JSONObject(response.readEntity(String.class));
        
        return json.getDouble("Rate");
    }
}
