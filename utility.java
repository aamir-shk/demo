/**
 * 
 */
package com.example.demo;


import org.springframework.core.env.Environment;

/**
 * @author aamir
 *
 */
public class utility {
	
	public void test (Environment env) {

		try {
			String baseurl = env.getProperty("baseurl", "");
			String clientid = env.getProperty("clientid", "");
			String clientsecret = env.getProperty("clientsecret", "");
			String tokenurl = env.getProperty("tokenurl", "");
			String clientcreds = env.getProperty("clientcreds", "");
			String attempturl = env.getProperty("attempturl", "");
			
			String idmbaseurl = env.getProperty("idmbaseurl", "");
			String idmusername = env.getProperty("idmusername", "");
			String idmpassword = env.getProperty("idmpassword", "");
		
			
		} catch (Exception e) {
			
		}
		
	}

}
