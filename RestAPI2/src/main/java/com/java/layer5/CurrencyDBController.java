package com.java.layer5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.layer2.Currency;
import com.java.layer4.CurrencyService;
import com.java.layer4.CurrencyServiceImpl;

//			project folder-----><-web.xml
// http://localhost:port/RestAPI/rest/  currency/greet
/*
 * virtual tree structure of huge resources
 * 
 * RestAPI
 *   |
 * 	ds <-- web.xml level
 * 	 |
 * 	  rest <-- web.xml level
 * 		  |
 * 		-------------------
 * 		|		|		|
 * 		paris	pune	bengaluru <-- class level
 * 		|		|		|
 * 		greet	greet	greet <-- method level
 * 
 * 
 *  http://ip:port/RestAPI/ds/rest/bengaluru/greet
 *  http://ip:port/RestAPI/ds/rest/pune/greet
 *  http://ip:port/RestAPI/ds/rest/paris/greet

 * 
 */
//layer 5
@Path("/currencydb") 
public class CurrencyDBController {
	CurrencyService currencyService = new CurrencyServiceImpl();
	
	public CurrencyDBController() {
		
	}
	
	@GET
	@Path("/convert/{src}/{trg}/{amt}")
	public float convert(@PathParam(value = "src") String source, @PathParam(value="trg") String target, @PathParam(value="amt") float amount) {
		
		double amt=0;
		try {
			amt = 
		}
		catch() {
			
		}
		return amt;
	}
	
}
