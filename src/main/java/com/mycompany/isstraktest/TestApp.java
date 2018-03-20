/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isstraktest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.google.gson.*;
import java.lang.reflect.Modifier;
/**
 *
 * @author James
 */
public class TestApp {
    
    public static void main(String[] args){
        
        //URL for 'Open Notify' API
        String getURL = "http://api.open-notify.org/iss-now.json";
        
        //Create a client
        Client client = Client.create();
        
        //set target to client
        WebResource target = client.resource(getURL);
        
        //get response
        ClientResponse response = target.get(ClientResponse.class);
        
        String json = response.getEntity(String.class);
        
        TestGUI n = new TestGUI();
        n.setVisible(true);
        
        ISS iss = new Gson().fromJson(json, ISS.class);
        
        System.out.println(json);
        System.out.println(iss.getMessage());
        System.out.println(iss.getTimestamp());
        ISSPosition pos = iss.getPosition();
        System.out.println("lat: " + pos.getLatitude() + " long: " + pos.getLongitude());
    }
}
