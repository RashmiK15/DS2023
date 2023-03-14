package com.java.layer2;

public class Currency {

	private int currencyId;
	private String sourceCurrency;
	private String targetCurrency;
	private float loadFactor;

	public Currency() {
		
		System.out.println("Currency cru..");
		
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public String getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public String getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public float getLoadFactor() {
		return loadFactor;
	}

	public void setLoadFactor(float loadFactor) {
		this.loadFactor = loadFactor;
	}

	@Override
	public String toString() {
		return "Currency [currencyId=" + currencyId + ", sourceCurrency=" + sourceCurrency + ", targetCurrency="
				+ targetCurrency + ", amountToConvert=" + loadFactor + "]";
	}
	
	

}
