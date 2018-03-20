/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isstraktest;

/**
 *
 * @author James
 */
public class ISS {
    private String message;
    private ISSPosition iss_position;
    private long timestamp;
    
    public String getMessage(){
        return message;
    }
    
    public ISSPosition getPosition(){
        return iss_position;
    }
    
    public long getTimestamp(){
        return timestamp;
    }
}
