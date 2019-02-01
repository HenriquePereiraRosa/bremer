package bremer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeerController {
	
	@RequestMapping("/beer/new")
	public String newBeer() {
		return "beer/BeerRegister"; // Return the page template address 
	}
}
