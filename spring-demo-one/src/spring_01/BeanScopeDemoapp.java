package spring_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.util.SystemPropertyUtils;

public class BeanScopeDemoapp {

	public static void main(String[] args) {
		// load the Spring configure fill
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope_applicationContext2.xml");
		
		// retrieve bean from spring container 
        Coach theCoach = context.getBean("myCoach" , Coach.class);
        
        Coach alphaCoach = context.getBean("myCoach" , Coach.class);
        
        // check if they are the same 
        boolean result = (theCoach == alphaCoach);
        System.out.println("\npointing to the same object " + result);
        
        System.out.println("\nMemory location for the Coach " + theCoach);
        
        System.out.println("\nMemory location for the Coach " + alphaCoach);

        // close the context
        context.close();
	}

}
