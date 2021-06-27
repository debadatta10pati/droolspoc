package com.sample.test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Car;
import com.sample.model.Customer;
import com.sample.model.ShoppingCart;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTestDSLExample {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	Car car = new Car();
        	
        	car.setCarPrice(5000);
        
            kSession.insert(car);
            System.out.println(" Rules fired " +kSession.fireAllRules());
            
            kSession.getObjects().forEach(object -> {
         	   if (object instanceof Car) {
         		  Car carNew = (Car) object;
         	    System.out.println("Inserted Car Object fetched from KieSession using getObjects() After Firing Rules - \n"
         	      + carNew.toString());
         	   }
         	  });
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
