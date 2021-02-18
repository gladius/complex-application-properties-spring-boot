package io.thepro.services;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("complex-properties")
@Data
public class ComplexProperties {

	private ArrayList<String> countries;

	private ArrayList<Integer> years;

	private Map<String, Boolean> allowedProfessions;

	private Map<String, Integer> availableSlots;

}
