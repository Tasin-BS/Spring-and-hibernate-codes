package spring.demo.annotation1;

public class SwimCoach implements Coach {

	private FortuneService FortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
	    FortuneService = theFortuneService;
	}
	@Override
	public String getdailyworkout() {
		return "swim 1000 meters as a warm up";
	}

	@Override
	public String getdailyfortune() {
		return FortuneService.getdailyfortune();
	}

}
