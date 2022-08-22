package com.TeamLease.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(MobileConfiguration.class);
        
        Iphone SevenPlus = factory.getBean(Iphone.class);
        SevenPlus.specs();
    }
}
