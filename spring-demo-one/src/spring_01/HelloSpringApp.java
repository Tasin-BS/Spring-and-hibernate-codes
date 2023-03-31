package spring_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean form spring container 
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
		// call methods on bean
		System.out.println(theCoach.getdailyworkout());
		
		//let's call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
