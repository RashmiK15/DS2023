package com.java.layer3;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Currency;

public class DaoImplTest {

	
	@Test
	public void testDrivenDevelopment() {
		System.out.println("Testing condition 1");
		Assertions.assertTrue(100>15);
		System.out.println("condition 1 passed");
	}
	
	@Test
	public void testLoadAllCurrencies() {
		
		System.out.println("started DAO testing..");
		
		CurrencyDao currDao = new CurrencyDaoImpl();
		
		Assertions.assertTrue(currDao!=null); //go ahead only if object creation is successful
		
		List<Currency> currList = currDao.getCurrency();
		
		Assertions.assertTrue(currList.size()>0); //go ahead only if currency list is not empty
		
		for(Currency currency : currList) {
			System.out.println("Currency "+currency);
		}
	}
	
	@Test
	public void testLoadSingleCurrency() {
		
		System.out.println("started DAO testing..");
		
		CurrencyDao currDao = new CurrencyDaoImpl();
		
		Assertions.assertTrue(currDao!=null); //go ahead only if object creation is successful
		
		Currency curr = currDao.getCurrency(1);
		
		Assertions.assertTrue(curr!=null); //go ahead only if currency element is not empty

		System.out.println("Currency "+curr);		
	}
	
	@Test
	public void testAddSingleCurrency() {
		
		System.out.println("started DAO testing..Add");
		
		CurrencyDao currDao = new CurrencyDaoImpl();
		
		Assertions.assertTrue(currDao!=null); //go ahead only if object creation is successful
		
		Currency curr = new Currency();
		
		Assertions.assertTrue(curr!=null); //go ahead only if currency is not empty

		curr.setCurrencyId(5);
		curr.setSourceCurrency("INR");
		curr.setTargetCurrency("NEP");
		curr.setLoadFactor(500);
		
		System.out.println("Currency: "+curr);
		
		currDao.addCurrency(curr);
		System.out.println("Currency added");
	}
	
	@Test
	public void testUpdateSingleCurrency()
	{
		System.out.println("started DAO testing...");
		
		CurrencyDao currDao = new CurrencyDaoImpl();	
	Assertions.assertTrue(currDao!=null);
		
		Currency curr=new Currency();
	Assertions.assertTrue(curr!=null);
	
		curr.setCurrencyId(4);
		curr.setSourceCurrency("India");
		curr.setTargetCurrency("Nepal");
		curr.setLoadFactor(555);
		
		System.out.println("Currency : "+curr);
		currDao.updateCurrency(curr);
		System.out.println("Currency updated....");
	}
	
	@Test
	public void testDeleteSingleCurrency()
	{
		System.out.println("started DAO testing...");
		
		CurrencyDao currDao = new CurrencyDaoImpl();	
	Assertions.assertTrue(currDao!=null);
		
		currDao.deleteCurrency(4);
		System.out.println("Currency deleted....");
	}
}
