package com.TeamLease.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Iphone {
	
	@Autowired
	Chipset cpu;
	
	public Chipset getCpu() {
		return cpu;
	}

	public void setCpu(Chipset cpu) {
		this.cpu = cpu;
	}

	public void specs() {
		System.out.println("Quad Core, 3GB RAM, 32GB Internal Memory, 12MP Camera, Fingerprint Sensor");
		cpu.process();
	}
}
