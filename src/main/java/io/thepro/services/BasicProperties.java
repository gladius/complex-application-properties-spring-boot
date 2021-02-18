package io.thepro.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicProperties {
	
	@Value("${basic-value}")
	private String basicValue;
	
	@Value("${nested-value-sample.name}")
	private String name;
	
	@Value("${nested-value-sample.age}")
	private int age;
	
	@Value("${nested-value-sample.is-pirate:false}")
	private boolean isPirate;
	
	
	public void printProperties() {
		System.out.println("Basic Value ==> "+basicValue);
		System.out.println("Name ==> "+name);
		System.out.println("Age ==> "+age);
		System.out.println("isPirate ==> "+isPirate);

	}

}
