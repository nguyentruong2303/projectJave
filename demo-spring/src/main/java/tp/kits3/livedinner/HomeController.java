package tp.kits3.livedinner;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 * @Controller mean this class is Servlet
 * URI mapping to method
 */
@Controller
public class HomeController {
	//Injection : create other object in this class
	@Autowired
	private ModelService modelService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info(" {}.", "HomeController:home");
		modelService.getModelData();
		
		return "home";
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String doPost(Locale locale, Model model) {
		logger.info(" {}.", "HomeController:home");
		
		
		return "home";
	}

	
}
