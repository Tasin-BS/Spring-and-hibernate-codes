package spring_01;

public class trackCoach implements Coach {

	private FortuneService fortuneService;
	public trackCoach() {
		
	}
	public trackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getdailyworkout() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it :" + fortuneService.getFortune();
	}
}
