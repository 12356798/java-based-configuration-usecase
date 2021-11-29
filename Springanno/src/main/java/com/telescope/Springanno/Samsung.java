package com.telescope.Springanno;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung 
{
	@Autowired
	MobileProcesser cpu;

	public MobileProcesser getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcesser cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("4gb ram,12mp camera,j1,j2");
		cpu.process();
	}

}
