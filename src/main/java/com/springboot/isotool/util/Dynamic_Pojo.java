package com.springboot.isotool.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javassist.CannotCompileException;
import javassist.NotFoundException;

public class Dynamic_Pojo {

	private static FileWriter myWriter;

	public static void main(String[] args) throws NotFoundException, CannotCompileException {
		
		Map<String, Class<?>> props = new HashMap<String, Class<?>>();
		props.put("foo", Integer.class);
		props.put("bar", String.class);
		
		Class<?> clazz = PojoGenerator.generate(
		        "sk", props);
		
		try {
			@SuppressWarnings("deprecation")
			Object obj = clazz.newInstance();
			System.out.println("Clazz: " + clazz);
			System.out.println("Clazz: " + clazz);
			System.out.println("Object: " + obj.getClass()+obj.toString());
			 myWriter = new FileWriter("filename.txt");
		     myWriter.write("Files in Java might be tricky, but it is fun enough!");
			 myWriter.write(String.valueOf(obj));
		     myWriter.close();
		     String a = myWriter.getEncoding();
		     System.out.println(a);
			System.out.println("Serializable? " + (obj instanceof Serializable));

			for (final Method method : clazz.getDeclaredMethods()) {
			    System.out.println("Hii "+method);
			}

			// set property "bar"
			try {
				clazz.getMethod("setBar", String.class).invoke(obj, "Hello World!");
				String result = (String) clazz.getMethod("getBar").invoke(obj);
				System.out.println("Value for bar: " + result);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// get property "bar"
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
