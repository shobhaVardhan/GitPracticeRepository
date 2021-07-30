package com.cjc.Log4j;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4JDemo {
	
	static Logger log=Logger.getLogger(Log4JDemo.class.getName());
	
	public static void main(String[] args) throws IOException {
		/*
		  BasicConfigurator.configure(); log.debug("DEBUG");
		 System.out.println("console message");
		 log.debug("DEBUG");
		 log.debug("INFO");
		 log.debug("WARN");
		 */
		
		//Layout l =new HTMLLayout();
		
		/*
		  Layout l =new SimpleLayout();		  
		  Appender ap=new ConsoleAppender(l);		  
		  log.addAppender(ap);
		 */
		  
		// add logs in a file
		/*  Layout l =new SimpleLayout();		  
		  Appender ap=new FileAppender(l,"abc.txt");		  
		  log.addAppender(ap);
		*/
		
		
		log.debug("DEBUG");
	}

}
