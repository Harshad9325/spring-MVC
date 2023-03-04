package Springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	// home page
	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("this is home url");

		model.addAttribute("name", "harshad");
		model.addAttribute("id", 12345678);
		List<String> friends = new ArrayList<String>();
		friends.add("harsh");
		friends.add("abhi");
		friends.add("sam");
		friends.add("raj");
		model.addAttribute("f", friends);
		return "index";
	}

//about page
	@RequestMapping("/about")
	public String about() {

		System.out.println("this is about url");
		return "about";
	}

//service page
	@RequestMapping("/service")
	public String servic() {
		System.out.println("thise is service url");
		return "service";
	}
//use modelAndView
//help page
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help url");
		
		//creating object model and view
		ModelAndView modelAndView=new ModelAndView();
		//seting the data
		modelAndView.addObject("name","sam");
		modelAndView.addObject("mo.no",96075531);
		modelAndView.addObject("add", "nashik");
		LocalTime now=LocalTime.now();
		modelAndView.addObject("time", now);
		LocalDate now1=LocalDate.now();
		modelAndView.addObject("date", now1);
		//marks\
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(45);
		list.add(34);
		modelAndView.addObject("marks", list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
