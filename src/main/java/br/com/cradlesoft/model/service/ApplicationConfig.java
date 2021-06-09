/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cradlesoft.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.jettison.JettisonFeature;

/**
 *
 * @author luciolima
 */
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /** 
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.cradlesoft.model.service.ClassificacaoFacadeREST.class);
        resources.add(br.com.cradlesoft.model.service.ClienteFacadeREST.class);
    }
    
//        @Override
//	public Map<String, Object> getProperties() {
//		Map<String, Object> properties = new HashMap<>();
//		properties.put("jersey.config.server.provider.packages", "br.com.cradlesoft.model.service.");
//		
//		return properties;
//	}
//	
//	@Override
//	public Set<Object> getSingletons() {
//		Set<Object> singletons = new HashSet<>();
//		singletons.add(new JettisonFeature());
//		
//		
//		return singletons;
//	}
    
}
