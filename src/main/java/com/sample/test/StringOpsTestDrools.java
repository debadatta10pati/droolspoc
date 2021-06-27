package com.sample.test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Car;
import com.sample.model.Customer;

/**
 * This is a sample class to launch a rule.
 */
public class StringOpsTestDrools {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			// go !
			Car car1 = new Car();
			car1.setCarName("Cadillac");
			kSession.insert(car1);
		
			
			System.out.println("Number of rules executed:=" + kSession.fireAllRules());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}