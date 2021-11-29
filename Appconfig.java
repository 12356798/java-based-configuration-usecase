package com.telescope.Springanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig
{
     @Bean
	public Samsung getPhoone()
	{
		return new Samsung();
	}
     
     @Bean
     public MobileProcesser getProcesser()
     {
    	 return new Snapdrigon();
     }
     
     
}
