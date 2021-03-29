package com.springboot.isotool.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.springboot.isotool.model.InputModel;
import com.springboot.isotool.model.OutputModel;
import com.springboot.isotool.util.ISOConstants;

@Service
@PropertySource("classpath:response.properties")
public class IsoService {
	
	@Autowired
	Environment env;
	 
	
	public List<String> processDataElements(InputModel inputMode) {
		List<String> output = new ArrayList<String>();
		String element = inputMode.getDataElement();
		System.out.println("element : "+element);
		
		switch(element) {
		
		case "02":
			      output.add(env.getProperty("Element02"));
			break;
			
		case "03":
			      output =fetchProcessingCode(inputMode);
			break;
		
		case "38":
			     output.add(env.getProperty("Element38"));
			break;
		
		case "39":
			     output.add(env.getProperty(inputMode.getResponse()));
			break;
			
		default:
		output = null;
		break;
		}
		
		return output;
	}

	private List<String> fetchProcessingCode(InputModel response) {
		List<String> output = new ArrayList<String>();
		String input = response.getResponse();
		System.out.println(input);
		int begin=0;
		
		for(int i=1;i<=3;i++) {
			String op = env.getProperty(response.getDataElement()+"-"+i+"-"+input.substring(begin,begin+2));
			output.add(op);
			begin += 2;
		}
		return output;
	}
}
