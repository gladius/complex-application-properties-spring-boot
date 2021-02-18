package io.thepro.services;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import io.thepro.services.models.Hero;
import lombok.Data;

@Component
@ConfigurationProperties("nested-complex-properties")
@Data
public class NestedProperties {
	private Hero hero;
}
