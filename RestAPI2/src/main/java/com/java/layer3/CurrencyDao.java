//POJI

package com.java.layer3;

import java.util.List;

import com.java.layer2.Currency;

public interface CurrencyDao {

		void addCurrency(Currency e);    //C-create
		List<Currency> getCurrency();   //R-read/all
		Currency getCurrency(int empno); //R-read/single
		void updateCurrency(Currency e); //U-Update
		void deleteCurrency(int empno);  //D-delete
		
		
		
		
		

	

}
