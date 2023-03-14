package com.java.layer4;

import java.util.List;

import com.java.layer2.Currency;

public interface CurrencyService {
	/*Currency findCurrencyService(int currencyId);
	List<Currency> findAllAllCurrenciesService();
	
	void add(Currency currency);
	void modifyCurrencyService(Currency currency);
	void removeCurrencyService(int currencyId);
	*/
	float calculateCurrencyService(String s,String t, float amt) throws CurrencyNotFoundException,SourceCurrencyNotFoundException, TargetCurrencyNotFoundException;
	
}



