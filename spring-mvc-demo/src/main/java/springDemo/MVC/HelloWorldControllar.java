package springDemo.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldControllar {

	//need a controller method to show the initial html from
	@RequestMapping("/showFrom")
	public String showfrom()
	{
		return "helloworld-from";
	}
	//need a controller method to process the from
	@RequestMapping("/processFrom")
	public String processFrom()
	{
		return "helloworld";
	}
	
	//read data from the from and add to the model 
	@RequestMapping("/processFromVersionTwo")
	public String letsshoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the html from
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFromVersionThree")
	public String processFromVersionThree(
			@RequestParam("studentName") String theName, Model model) {
		
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hy my Friend form v3! " + theName;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}
