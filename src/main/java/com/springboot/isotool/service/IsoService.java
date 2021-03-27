package com.springboot.isotool.service;

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
	
	public String processDataElements(InputModel inputMode) {
		String output = null;
		String element = inputMode.getDataElement();
		System.out.println("element : "+element);
		
		switch(element) {
		
		case "38":
			output = ISOConstants.element38;
			break;
		
		case "39":
			output = env.getProperty(inputMode.getResponse());
			break;
			
		default:
		output = null;
		break;
		}
		
		return output;
	}
}
