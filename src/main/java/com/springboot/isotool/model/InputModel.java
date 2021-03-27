package com.springboot.isotool.model;

import org.springframework.beans.factory.annotation.Autowired;

public class InputModel {
	
	private String response;
	
	private String dataElement;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getDataElement() {
		return dataElement;
	}

	public void setDataElement(String dataElement) {
		this.dataElement = dataElement;
	}

	@Override
	public String toString() {
		return "InputModel [response=" + response + ", dataElement=" + dataElement + "]";
	}

	

}
