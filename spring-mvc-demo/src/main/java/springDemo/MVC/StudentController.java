package springDemo.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showFrom")
	public String showFrom(Model theModel) {
		
		//create a student object
		Student theStudent = new Student();
		
		//add student object to the model
		theModel.addAttribute("student",theStudent);
		return "student-from";
	}
	
	@RequestMapping("/processFrom")
	public String processFrom(@ModelAttribute("student") Student theStudent) {
		//log the input
		System.out.println("theStudent " + theStudent.getFirstName()+ "   "
				+ theStudent.getLastName());
		return "student-confirmation";
	}
}
