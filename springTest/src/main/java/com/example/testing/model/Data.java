/**
 * Data Model
 * 		Used to pass form data from FormPage to DisplayPage
 * 
 * 12/28/18 - SBL - initial creation of model
 */

package com.example.testing.model;

import lombok.Getter;
import lombok.Setter;

public class Data {
	@Getter @Setter
	private String fname;
	
	@Getter @Setter
	private String lname;
	
	@Getter @Setter
	private String job;
	
	@Getter @Setter
	private int age;
}
