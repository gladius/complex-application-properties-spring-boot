package io.thepro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.thepro.services.BasicProperties;
import io.thepro.services.ComplexProperties;
import io.thepro.services.NestedProperties;

@SpringBootApplication
public class PropertiesDemoApplication implements CommandLineRunner {

	@Autowired
	BasicProperties basicProperties;

	@Autowired
	ComplexProperties complexProperties;

	@Autowired
	NestedProperties nextedProperties;

	public static void main(String[] args) {
		SpringApplication.run(PropertiesDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("");
		System.out.println("********************************* Basic Properties ******************************");
		basicProperties.printProperties();
		System.out.println("********************************* ---------------------- ******************************");
		System.out.println("");
		System.out.println("");
		System.out.println("********************************* Complex Properties ******************************");
		System.out.println(complexProperties.toString());
		System.out.println("********************************* ---------------------- ******************************");
		System.out.println("");
		System.out.println("");
		System.out.println("********************************* Nested Properties ******************************");
		System.out.println(nextedProperties.toString());
		System.out.println("********************************* ---------------------- ******************************");
		System.out.println("");
		System.out.println("");
	}

}
