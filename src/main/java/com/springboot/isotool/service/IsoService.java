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
		String element = inputMode.getdE();
		System.out.println("element : " + element);

		switch (element) {

		case "DE-02":
			output.add(env.getProperty("Element02"));
			break;

		case "DE-03":
			output = fetchProcessingCode(inputMode);
			break;

		case "DE-04":
			output.add(env.getProperty("Element04"));
			break;

		case "DE-05":
			output.add(env.getProperty("Element05"));
			break;

		case "DE-06":
			output.add(env.getProperty("Element06"));
			break;

		case "DE-07":
			output.add(env.getProperty("Element07"));
			break;

		case "DE-09":
			output.add(env.getProperty("Element09"));
			break;

		case "DE-10":
			output.add(env.getProperty("Element10"));
			break;

		case "DE-11":
			output.add(env.getProperty("Element11"));
			break;

		case "DE-12":
			output.add(env.getProperty("Element12"));
			break;

		case "DE-13":
			output.add(env.getProperty("Element13"));
			break;

		case "DE-14":
			output.add(env.getProperty("Element14"));
			break;

		case "DE-15":
			output.add(env.getProperty("Element15"));
			break;

		case "DE-16":
			output.add(env.getProperty("Element16"));
			break;

		case "DE-18":
			output.add(env.getProperty("Element18"));
			break;

		case "DE-19":
			output.add(env.getProperty("Element19"));
			break;

		case "DE-22":
			output.add(env.getProperty("Element22"));
			break;

		case "DE-38":
			output.add(env.getProperty("Element38"));
			break;

		case "DE-39":
			output.add(env.getProperty(inputMode.getResponseCode()));
			break;

		default:
			output = null;
			break;
		}

		return output;
	}

	private List<String> fetchProcessingCode(InputModel response) {
		List<String> output = new ArrayList<String>();
		String input = response.getResponseCode();
		System.out.println(input);
		int begin = 0;

		for (int i = 1; i <= 3; i++) {
			String op = env.getProperty(response.getdE() + "-" + i + "-" + input.substring(begin, begin + 2));
			output.add(op);
			begin += 2;
		}
		return output;
	}
}
