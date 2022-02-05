/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cradlesoft.model.service;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Application;

/**
 *
 * @author lucio
 */
public class ApplicationJAXRS extends Application {
    
    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.provider.packages",
                "br.com.cradlesoft.model.service");
        return properties;
    }
    
    
}
