package com.springboot.isotool.model;


public class InputModel {
	
	private String responseCode;
	private String dE;
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getdE() {
		return dE;
	}
	public void setdE(String dE) {
		this.dE = dE;
	}
	@Override
	public String toString() {
		return "InputModel [responseCode=" + responseCode + ", dE=" + dE + "]";
	}
	
	
	
	
	
	
}
