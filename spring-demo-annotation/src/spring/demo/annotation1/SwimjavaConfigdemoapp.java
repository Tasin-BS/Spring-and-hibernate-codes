package spring.demo.annotation1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimjavaConfigdemoapp {

	public static void main(String[] args) {
		
		//read spring config java Class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the from spring container 
		Coach thCoach = context.getBean("swimCoach" ,Coach.class);
		
		//call a method on the been
		System.out.println(thCoach.getdailyworkout());
		
		// call method to get daily fortune
		System.out.println(thCoach.getdailyfortune());
		
		//close the context
		context.close();
	}

}
