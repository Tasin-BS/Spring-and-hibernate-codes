package spring.demo.annotation1;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getdailyfortune(){
		return "Today is your lucky day";
	}

}
