package spring.demo.annotation1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotationdemoapp {

	public static void main(String[] args) {
		
		//read spring config fill
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the from spring container 
		Coach thCoach = context.getBean("tennisCoach" ,Coach.class);
		
		//call a method on the been
		System.out.println(thCoach.getdailyworkout());
		
		// call method to get daily fortune
		System.out.println(thCoach.getdailyfortune());
		
		//close the context
		context.close();
	}

}
