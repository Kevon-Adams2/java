package com.mycompany;

import com.mycompany.development.Development;

import sales.Sales;

public class Corporate {
	
	private Development devGroup = null;
	private Sales salesTeam = null;
	
	public Corporate() {
		this.devGroup = new Development();
	}

	public String getAnnualReport() {
		return null;
	}
	
	public String buyProduct() {
		return null;
	}

	public void bugReport() {
		((Development) this.devGroup).bugReport();
	}
}