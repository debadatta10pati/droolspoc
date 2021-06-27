package com.sample.test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Customer;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTestFunctionCallDB {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	Customer customer = new Customer();
        	
        	customer.setAge(23);
        	customer.setName("Deb");
            kSession.insert(customer);
            System.out.println("Number of rules executed:=" + kSession.fireAllRules());
           
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

  }
