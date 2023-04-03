package spring.demo.annotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {
    
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	
	public tennisCoach()
	{
		System.out.println(">>tennisCoach : inside default consturctor");
	}
	
    /*DEFINE A SETTER METHOD INJECTION
	@AUTOWIRED
	PUBLIC VOID SETFORTUNESERVICE(FORTUNESERVICE THEFORTUNESERVICE) {
		SYSTEM.OUT.PRINTLN(">>TENNISCOACH : INSIDE SETFORTUNESERVICE");
		THIS.FORTUNESERVICE = THEFORTUNESERVICE;
	}
	
    DEFINE A METHOD INJECTION
	@AUTOWIRED
	PUBLIC VOID DOSOMECRAZYSTUFF(FORTUNESERVICE THEFORTUNESERVICE) {
		SYSTEM.OUT.PRINTLN(">>TENNISCOACH : INSIDE DOSOMECRAZYSTUFF");
		THIS.FORTUNESERVICE = THEFORTUNESERVICE;
	}
	
	 CONSTRUCTOR INJECTION
	@AUTOWIRED
	PUBLIC TENNISCOACH(FORTUNESERVICE THEFORTUNESERVICE)
	{
		FORTUNESERVICE = THEFORTUNESERVICE;
	}*/
	
	@Override
	public String getdailyworkout(){
		return "practice your backhand volly";
	}

	@Override
	public String getdailyfortune() {
		return fortuneService.getdailyfortune();
	}

}
