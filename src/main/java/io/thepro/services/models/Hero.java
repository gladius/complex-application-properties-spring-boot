package io.thepro.services.models;

import java.util.List;

import lombok.Data;

@Data
public class Hero {

	private String name;
	private int age;
	private List<String> skills;
}
