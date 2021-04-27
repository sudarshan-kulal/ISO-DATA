package com.springboot.isotool.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.jpos.iso.ISOMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.isotool.model.InputModel;
import com.springboot.isotool.model.OutputModel;
import com.springboot.isotool.service.IsoService;
import com.springboot.isotool.util.ISOConstants;
import com.springboot.isotool.util.ISOMessageBreaker;

@RestController
@PropertySource("classpath:response.properties")
//@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping(value = "/api")
public class ISOController {

	@Autowired
	IsoService service;

	@Autowired
	Environment env;

	@GetMapping("/test")
	public String Test() {
		return "Hello World!";
	}

	//@PostMapping(value ="/getResponseMsg",  headers = "content-type=application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping("/getResponseMsg")
	public ResponseEntity<?> fetchResponse(@RequestBody InputModel inputModel) {
		OutputModel outputmodel = new OutputModel();
		List<String> output = null;
		try {
			//String output = null;
			System.out.println("INput from UI : " + inputModel);
			output = service.processDataElements(inputModel);
			//output.removeIf(Objects::isNull);
			if (!output.contains("null") && !output.isEmpty()) {
				System.out.println("resp" + output);
				outputmodel.setResponse(output);
				outputmodel.setStatus("Success");
				return new ResponseEntity<>(outputmodel, HttpStatus.OK);
			} else {
				outputmodel.setResponse(output);
				outputmodel.setStatus("Fail");
				return new ResponseEntity<>(ISOConstants.RECORD_NOT_FOUND, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
			outputmodel.setStatus("Fail");
			return new ResponseEntity<>(ISOConstants.ERROR, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	@PostMapping("/getMessage")
	public ResponseEntity<?> getResponse(@RequestBody InputModel inputModel) {
		String message = inputModel.getResponseCode();
		System.out.println("Test"+message);
		ISOMessageBreaker isoMessageBreaker = new ISOMessageBreaker();
		OutputModel outputmodel = new OutputModel();
		List<String> output = null;
		try {
            ISOMsg isoMsg = isoMessageBreaker.parseISOMessage(message);
            output = isoMessageBreaker.printISOMessage(isoMsg);
            if (!output.contains("null") && !output.isEmpty()) {
            outputmodel.setResponse(output);
            outputmodel.setStatus("Success");
            return new ResponseEntity<>(outputmodel, HttpStatus.OK);
            }
            else {
				outputmodel.setResponse(output);
				outputmodel.setStatus(ISOConstants.RECORD_NOT_FOUND);
				return new ResponseEntity<>(outputmodel, HttpStatus.INTERNAL_SERVER_ERROR);
			}
        } catch (Exception e) {
            e.printStackTrace();
            outputmodel.setResponse(output);
			outputmodel.setStatus(ISOConstants.ERROR);
			return new ResponseEntity<>(outputmodel, HttpStatus.INTERNAL_SERVER_ERROR);
        }
		
		
	}

}
