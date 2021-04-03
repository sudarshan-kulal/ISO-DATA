package com.springboot.isotool.model;

public class Response {
	
	private String tag;
	private String length;
	private String value;
	private String response;
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Response [tag=" + tag + ", length=" + length + ", value=" + value + ", response=" + response + "]";
	}
	
	
	
	

}
