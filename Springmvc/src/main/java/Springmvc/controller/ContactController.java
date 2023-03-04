package Springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Springmvc.model.User;
import Springmvc.service.userService;

@Controller
public class ContactController {
	@Autowired
	private userService userService;

	@ModelAttribute
	public void Commandata(Model m) {
		m.addAttribute("Header", "Adding model Attribute");
		m.addAttribute("desc", "Home for programer");
		System.out.println("common data methode");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("contact controller");
		return "contact";
	}

	// use modelAttribute
	@RequestMapping(path = "/proccessform", method = RequestMethod.POST)
	public String handelform(@ModelAttribute User user, Model model) {

		System.out.println(user);
		if(user!=null ) {
			return "redirect:/contact";
		}else 
			
		
		this.userService.createUser(user);
		return "success";
		
	}

	// use request param
	/*
	 * @RequestMapping(path="/proccessform",method=RequestMethod.POST) public String
	 * handelform(
	 * 
	 * @RequestParam("email")String userEmail,
	 * 
	 * @RequestParam("name")String userName,
	 * 
	 * @RequestParam("password")String userPassword, Model model) {
	 * 
	 * // System.out.println("USER EMAIL:"+userEmail); //
	 * System.out.println("USER NAME:"+userName); //
	 * System.out.println("USER PASSWORD:"+userPassword ); // //
	 * model.addAttribute("email",userEmail ); // model.addAttribute("name",
	 * userName); // model.addAttribute("password", userPassword); User user=new
	 * User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * model.addAttribute("user", user); return "success"; }
	 */
}
