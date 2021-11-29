package com.telescope.Springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext factery =new AnnotationConfigApplicationContext(Appconfig.class);
        
        Samsung s7 = factery.getBean(Samsung.class);
        s7.config();
    }
}
