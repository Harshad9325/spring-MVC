package Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	
	//use RedirectView to redirect
	
	/*
	 * public RedirectView one() { System.out.println("this is one handeller");
	 * RedirectView redirectView = new RedirectView();
	 * redirectView.setUrl("https://www.google.com"); return redirectView ;
	 */
	
	//use prefix to redirect
	public String one() {
		System.out.println("this is one handeller");
		return "redirect:/enjoy";
}
@RequestMapping("/enjoy")
public String two() {
	System.out.println("this is second handeller[enjoy]");
	return "contact";
}
}
