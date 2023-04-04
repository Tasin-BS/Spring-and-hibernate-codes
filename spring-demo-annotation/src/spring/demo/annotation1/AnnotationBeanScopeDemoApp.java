package spring.demo.annotation1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
        //retrieve bean from container 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\npointing to the same object : "+result);
		
		System.out.println("\nMemory location for theCoach : "+ theCoach);
		
		System.out.println("\nMemory location for alphaCoach : "+ alphaCoach);
		
		//close context
		context.close();
	}

}
