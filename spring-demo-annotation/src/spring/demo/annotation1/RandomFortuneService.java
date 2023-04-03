package spring.demo.annotation1;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of string
	private String[] data = {
			"i am a java devoloper",
			"i have a beautifull life",
			"i will do better then the past	"
	};
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getdailyfortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
