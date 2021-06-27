package com.sample.test;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.ObjectFilter;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

import com.sample.model.Customer;


/**
 * This is a sample class to launch a rule.
 */
public class RetrieveInsertedFactsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kieSession = kContainer.newKieSession("ksession-rules");
            // go !            
        	kieSession.fireAllRules();
        	
        	
        	// Approach 1 Using getObjects() method
        	  kieSession.getObjects().forEach(object -> {
        	   if (object instanceof Customer) {
        		   Customer customerNew = (Customer) object;
        	    System.out.println("Inserted Customer Object fetched from KieSession using getObjects() After Firing Rules - \n"
        	      + customerNew.toString());
        	   }
        	  });
        	  
        	  System.out.println("\n");

        	  // Approach 2 Using QueryResults
        	  QueryResults results = kieSession.getQueryResults("getObjectsOfCustomer");
        	  for (QueryResultsRow row : results) {
        		  Customer customer = (Customer) row.get("$insertedCustomerObjectInDRLFile");
        	   System.out.println("Inserted Customer Object fetched from KieSession using QueryResult Object After Firing Rules - \n"
        	     + customer.toString());
        	  }

        	  kieSession.dispose();	 

        	
        	
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    


  }
