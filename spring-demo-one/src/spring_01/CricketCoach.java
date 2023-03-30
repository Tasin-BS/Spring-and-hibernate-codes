package spring_01;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	//Create a no-arg constructor
	public CricketCoach()
	{
		System.out.println("Cricket coach : inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach : inside no-arg constructor -setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getdailyworkout() {
		//System.out.println("Cricket coach : inside no-arg constructor -setFortuneService");
		return "practice fast bowling for 15 minuts";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
