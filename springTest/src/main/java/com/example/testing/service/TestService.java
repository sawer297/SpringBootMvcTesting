/**
 * Test Service Class
 * 		
 * 
 * 1/10/19 - SBL - Initial creation of class 
 * 1/29/19 - SBL - setReporterUrl method added
 */

package com.example.testing.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class TestService {
	
	static private String reporterUrl;

	/**
	 * setReporterUrl method
	 * 		retrieves URL from application.properties and sets into static variable
	 * @param value - URL from application.properties
	 * 
	 * 1/29/19 - SBL - initial code
	 */
	@Value("${reporter.url}")
	public void setReporterUrl(String value){
		reporterUrl = value;
	}//end setReporterUrl()
	
	/**
	 * getRandom method
	 * 		retrieves random number from online site
	 * 		used to test whether application could run method once on startup
	 * 
	 * 1/10/19 - SBL - initial code
	 */
	public void getRandom(){
		System.out.print("and the magic number is ... ");
		try {
			URL testurl = new URL("https://www.random.org/integers/?num=1&min=1&max=100&col=5&base=10&format=plain&rnd=new");
			URLConnection con = testurl.openConnection();
			InputStream is = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while ((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end getRandom()
	
	/**
	 * sendRequest method
	 * 		sends a '/healthcheck' request to a (hopefully) running reporter
	 * 		tests if application can reach and interact with other applications 
	 * 			that exists online
	 * 
	 * 1/10/19 - SBL - initial code
	 * 1/29/19 - SBL - modified so that URL is passed from application.properties
	 */
	public void sendRequest( ){
		System.out.println("sending healthcheck request @ "+ reporterUrl);
		try {
			//URL sendUrl = new URL("http://192.168.0.129:8082/healthcheck");
			//URL sendUrl = new URL("http://34.226.249.132:8080/reporter/healthcheck");
			URL sendUrl = new URL(reporterUrl);
			URLConnection con2 = sendUrl.openConnection();
			InputStream is = con2.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while ((line = br.readLine()) != null){
				System.out.println("\t"+line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end sendRequest()
	
}
