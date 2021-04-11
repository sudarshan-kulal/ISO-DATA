package com.springboot.isotool.service;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

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

		if (inputMode.getResponseCode() != null) {
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
				output = fetchPointServiceCondition(inputMode);
				break;

			case "DE-23":

				output.add(env.getProperty("Element23"));
				break;

			case "DE-25":
				output.add(env.getProperty(inputMode.getdE().substring(3, 5) + "-" + inputMode.getResponseCode()));
				break;

			case "DE-28":

				output.add(env.getProperty("Element28"));
				break;

			case "DE-32":

				output.add(env.getProperty("Element32"));
				break;

			case "DE-33":

				output.add(env.getProperty("Element33"));
				break;

			case "DE-35":

				output.add(env.getProperty("Element35"));
				break;

			case "DE-37":

				output.add(env.getProperty("Element37"));
				break;

			case "DE-38":

				output.add(env.getProperty("Element38"));
				break;

			case "DE-39":
				output.add(env.getProperty(inputMode.getResponseCode()));
				break;

			case "DE-40":

				output.add(env.getProperty("Element40"));
				break;

			case "DE-41":

				output.add(env.getProperty("Element41"));
				break;

			case "DE-42":

				output.add(env.getProperty("Element42"));
				break;

			case "DE-43":

				output.add(env.getProperty("Element43"));
				break;

			case "DE-44":

				output.add(env.getProperty("Element44"));
				break;

			case "DE-45":

				output.add(env.getProperty("Element45"));
				break;

			case "DE-49":

				output.add(env.getProperty("Element49"));
				break;

			case "DE-50":

				output.add(env.getProperty("Element50"));
				break;

			case "DE-51":

				output.add(env.getProperty("Element51"));
				break;

			case "DE-52":

				output.add(env.getProperty("Element52"));
				break;

			case "DE-55":
				output = fetchEMVData(inputMode.getResponseCode());
				break;

			case "DE-60":

				output.add(env.getProperty("Element60"));
				break;

			case "DE-62":

				output.add(env.getProperty("Element62"));
				break;

			case "DE-63":

				output.add(env.getProperty("Element63"));
				break;

			case "DE-70":

				output.add(env.getProperty("Element70"));
				break;

			case "DE-90":

				output.add(env.getProperty("Element90"));
				break;

			case "DE-91":

				output.add(env.getProperty("Element91"));
				break;

			case "DE-95":

				output.add(env.getProperty("Element95"));
				break;

			case "DE-101":

				output.add(env.getProperty("Element101"));
				break;

			case "DE-102":

				output.add(env.getProperty("Element102"));
				break;

			case "DE-103":

				output.add(env.getProperty("Element103"));
				break;

			case "DE-125":

				output.add(env.getProperty("Element125"));
				break;

			case "DE-126":

				output.add(env.getProperty("Element126"));
				break;

			case "DE-127":

				output.add(env.getProperty("Element127"));
				break;

			default:
				output = null;
				break;
			}

		}
		return output;
	}

	private List<String> fetchPointServiceCondition(InputModel responseCode) {
		List<String> output = new ArrayList<String>();
		String input = responseCode.getResponseCode();
		System.out.println(input);
		for (int i = 1; i <= 2; i++) {
			String op = null;
			if (i == 1)
				op = env.getProperty(responseCode.getdE().substring(3, 5) + "-" + input.substring(0, 2));
			if (i == 2)
				op = env.getProperty(responseCode.getdE().substring(3, 5) + "-" + input.substring(2));
			System.out.println("hello " + op);
			output.add(op);
		}
		return output;
	}

	// 9F02060000000000009F0306111111111111
	private List<String> fetchEMVData(String responseCode) {

		List<String> output = new ArrayList<String>();
		List<String> op2 = new ArrayList<String>();
		try {
			String emvdata = env.getProperty("EMVTAG");
			System.out.println(responseCode);
			String[] input = emvdata.split(",");

			for (String tag : input) {
				output.add(tag);
			}
			while (!responseCode.isEmpty()) {
				System.out.println("1 " + responseCode);
				int dataLengthToBeRemoved = 0;
				String temptag = "";
				// System.out.println(output.contains(responseCode.substring(0, 2)));
				// System.out.println(output.contains(responseCode.substring(0, 4)));
				if (output.contains(responseCode.substring(0, 2))) {
					temptag = responseCode.substring(0, 2);
				}
				if (output.contains(responseCode.substring(0, 4))) {
					temptag = responseCode.substring(0, 4);
					System.out.println("2 " + temptag);
				}
				System.out.println("3 " + temptag);
				String testStr = responseCode.substring(temptag.length());
				System.out.println("4 " + testStr);
				dataLengthToBeRemoved += temptag.length();
				String tagLength = testStr.substring(0, 2);
				System.out.println(testStr + " " + dataLengthToBeRemoved + " " + tagLength);
				if (tagLength.equalsIgnoreCase(testStr.substring(0, 2))) {
					dataLengthToBeRemoved += 2;
					int tagValueLength = Integer.parseInt(tagLength, 16) * 2;
					// System.out.println(tagValueLength);
					dataLengthToBeRemoved += tagValueLength;
					String tagValue = testStr.substring(2, tagValueLength + 2);
					op2.add(temptag + ":" + tagValue + ":" + env.getProperty(temptag));
					int totalTagDataLength = dataLengthToBeRemoved;
					responseCode = responseCode.substring(totalTagDataLength);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return op2;
	}

	private List<String> fetchProcessingCode(InputModel response) {
		List<String> output = new ArrayList<String>();
		String input = response.getResponseCode();
		System.out.println(input);
		System.out.println(response.getdE().substring(3, 5));
		int begin = 0;

		for (int i = 1; i <= 3; i++) {
			String op = env
					.getProperty(response.getdE().substring(3, 5) + "-" + i + "-" + input.substring(begin, begin + 2));
			output.add(op);
			begin += 2;
		}
		return output;
	}
}
