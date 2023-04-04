package spring.demo.annotation1;

public class SadFortuneService implements FortuneService {

	@Override
	public String getdailyfortune() {
		return "Today is a sad day";
	}

}
