package spring_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoapp {

	public static void main(String[] args) {
        // load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve bean from spring container 
		CricketCoach theCoach = context.getBean("myCricketCoach" , CricketCoach.class);
		
		// call method on the bean
		System.out.println(theCoach.getdailyworkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
