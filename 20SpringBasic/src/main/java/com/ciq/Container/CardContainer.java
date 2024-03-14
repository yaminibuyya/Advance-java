package com.ciq.Container;

import java.io.IOException;
import java.util.Properties;

public class CardContainer {
	
	  public Object getContainer(String yamini) {
		  Properties properties=new Properties();
		  try {
			properties.load(CardContainer.class.getClassLoader().getResourceAsStream("com/Configuration/config.file"));
			try {
				return Class.forName(properties.getProperty(yamini)).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yamini;
	  }

}
