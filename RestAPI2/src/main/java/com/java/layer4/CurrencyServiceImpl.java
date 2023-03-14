package com.java.layer4;

import java.util.ArrayList;
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
import com.java.layer3.CurrencyDao;
import com.java.layer3.CurrencyDaoImpl;

//   project folder ---><-- web.xml
//http://localhost:port/RestAPI/rest/  currency/greet
@Path("/currency")
public class CurrencyServiceImpl implements CurrencyService{

CurrencyDao currDao = new CurrencyDaoImpl();
	
	@Override								//   USD	INR		5000
	public float calculateCurrencyService(String s, String t, float amt) throws CurrencyNotFoundException,SourceCurrencyNotFoundException, TargetCurrencyNotFoundException
	{

		List<Currency> listCurrencies = currDao.getCurrency();
		
		boolean currencyFound=false;
		
		float calculatedAmount=0;
		
		for (Currency currency : listCurrencies) {
			System.out.println("=>Currency : "+currency);
			if(currency.getSourceCurrency().equals(s) && currency.getTargetCurrency().equals(t) ) {
					float currentLoadFactor = currency.getLoadFactor();
					calculatedAmount = amt * currentLoadFactor;		
					currencyFound=true;
					break;
			} else {
				currencyFound=false;
			}
		}
	
		if(currencyFound==false) {
			throw new CurrencyNotFoundException("Currency not found");
		}
		return calculatedAmount;
	}
	
	
}
