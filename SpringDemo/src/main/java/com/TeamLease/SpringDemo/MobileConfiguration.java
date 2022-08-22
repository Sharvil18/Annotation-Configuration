package com.TeamLease.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfiguration {
	
	@Bean
	public Iphone getPhone() {
		return new Iphone();
	}
	
	@Bean
	public Chipset getChipset() {
		return new AppleFusion();
	}
}
