package com.sample.test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Customer;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTestExistsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	Customer customer1 = new Customer();
        	
        	customer1.setAge(23);
        	customer1.setName("Kris");
            kSession.insert(customer1);
            
            Customer customer2 = new Customer();
        	
            customer2.setAge(54);
            customer2.setName("Deb");
            kSession.insert(customer2);
            
            
            Customer customer3 = new Customer();
        	
            customer3.setAge(35);
            customer3.setName("Luis");
            kSession.insert(customer3);
            
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

  }
