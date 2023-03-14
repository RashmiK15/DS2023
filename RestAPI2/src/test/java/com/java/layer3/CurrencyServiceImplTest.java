package com.java.layer3;

import org.junit.jupiter.api.Test;

import com.java.layer4.CurrencyNotFoundException;
import com.java.layer4.CurrencyService;
import com.java.layer4.CurrencyServiceImpl;
import com.java.layer4.SourceCurrencyNotFoundException;
import com.java.layer4.TargetCurrencyNotFoundException;

public class CurrencyServiceImplTest {

	
	@Test
	public void conversionTest() throws SourceCurrencyNotFoundException, TargetCurrencyNotFoundException, CurrencyNotFoundException {
		
		CurrencyService currService = new CurrencyServiceImpl();
		float convertedAmt = currService.calculateCurrencyService("USD", "EUR", 1200);
		System.out.println("Converted amount : "+convertedAmt);
		
	}

}
