package bremer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bremer.model.Beer;

@Controller
public class BeerController {
	
	@RequestMapping("/beer/new")
	public String newBeer() {
		return "beer/BeerRegister"; // Return the page template address 
	}
	
	@PostMapping("/beer/new")
	public String newBeerRegister (String sku) {
		System.out.println("newBeerRegister()");
		System.out.println("	input: " + sku);
		return "beer/BeerRegister";
	}
}
