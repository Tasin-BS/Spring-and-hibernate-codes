package spring.demo.annotation1;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getdailyfortune() {
		return null;
	}

}
