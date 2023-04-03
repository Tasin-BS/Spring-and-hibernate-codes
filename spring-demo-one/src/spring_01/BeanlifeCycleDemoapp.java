package spring_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.util.SystemPropertyUtils;

public class BeanlifeCycleDemoapp {

	public static void main(String[] args) {
		// load the Spring configure fill
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanlifeCycle_applicationContext3.xml");
		
		// retrieve bean from spring container 
        Coach theCoach = context.getBean("myCoach" , Coach.class);
        
	    System.out.println(theCoach.getdailyworkout());

        // close the context
        context.close();
	}

}
