package com.niit.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanTest {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.spring");
		context.refresh();
		
		
		MyBean myBean=(MyBean)context.getBean("myBean");
		myBean.display();	
	}

}
