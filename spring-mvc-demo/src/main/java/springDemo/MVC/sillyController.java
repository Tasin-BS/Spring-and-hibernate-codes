package springDemo.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sillyController {
     
	@RequestMapping("/showFrom")
	public String displayTheFrom() {
		return "silly";
	}
	
}
