package com.springboot.isotool.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ISOMessageBreaker {

	public ISOMsg parseISOMessage(String message) throws Exception {
		// String message =
		// "02003220000000808000000010000000001500120604120000000112340001840";
		//String message = "0200F238000128C0820000000000040000001660748412300000233110000000000000000216075921002586132921021606607892356074841230000023=261262019100000000104713002586ATM9992 PAWANA         3563189F02060000000000009F03060000000000009F2608A56E5A0C56828D529F0608A000000524101002820258009F2701809F34034201008408A0000005241010029F1E0842353132303336309F33036040009F1A0203569F350114950580000400005F2A0203569A032102169C01319F37045213CB099F3602000B9F10080105A000000000004F08A0000005241010029F090200019F4104000000465F34010100";
		System.out.printf("Message = %s%n", message);
		try {
			// Load package from resources directory.
			InputStream is = getClass().getResourceAsStream("/basic.xml");
			GenericPackager packager = new GenericPackager(is);
			ISOMsg isoMsg = new ISOMsg();
			isoMsg.setPackager(packager);
			isoMsg.unpack(message.getBytes());
			return isoMsg;
		} catch (ISOException e) {
			throw new Exception(e);
		}
	}

	public List<String> printISOMessage(ISOMsg isoMsg) {
		List<String> output = new ArrayList<String>();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;

		try {

			db = dbf.newDocumentBuilder();
			Document document = db.parse(new File("src\\main\\resources\\basic.xml"));
			NodeList nodeList = document.getElementsByTagName("isofield");
			Element element = null;
			//for (int i = 0; i < nodeList.getLength(); i++) {
			//	element = (Element) nodeList.item(i);
			//	System.out.println(element.getAttribute("name"));
			//}
			System.out.printf("MTI = %s%n", isoMsg.getMTI());
			for (int i = 1; i <= isoMsg.getMaxField(); i++) {
				if (isoMsg.hasField(i)) {
					// System.out.printf("Field (%s) = %s%n", i, isoMsg.getString(i));
					element = (Element) nodeList.item(i);
					output.add("Field (" + i + ") =" + isoMsg.getString(i)+" : "+element.getAttribute("name"));
					System.out.println(output);
					
					
					
				}
			}

		} catch (ISOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return output;
	}

}
