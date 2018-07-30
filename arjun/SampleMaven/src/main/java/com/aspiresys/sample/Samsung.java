package com.aspiresys.sample;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
    @Autowired
	MobileProcessor cpu;
	
	public void config()
	{
		System.out.println("Samsung s8 ");
		cpu.processor();
	}
	
}
