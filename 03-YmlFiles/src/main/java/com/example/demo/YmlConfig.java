package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("data")
@EnableConfigurationProperties
public class YmlConfig {
	
	@Value("${test.my.id}")
	private List<String> main;
	
	public List<String> getMain() {
		return main;
	}
	public void setMain(List<String> main) {
		this.main = main;
	}
	
	private Map<String, String> properties = new HashMap<String, String>();

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public YmlConfig() {
		// TODO Auto-generated constructor stub
		Map<String, String> properties2 = getProperties();
		System.out.println("the values are " + properties.get("name"));
		//System.out.println("the main value is " + main.size());
	}

}
