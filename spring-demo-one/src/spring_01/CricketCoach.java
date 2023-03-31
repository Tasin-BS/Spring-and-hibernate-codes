package spring_01;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for email and team name
	
	private String emailAddress;
	private String team;
	
	//Create a no-arg constructor
	public CricketCoach()
	{
		System.out.println("Cricket coach : inside no-arg constructor");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach : inside no-arg constructor -setEmail");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach : inside no-arg constructor -setTeam");
		this.team = team;
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
