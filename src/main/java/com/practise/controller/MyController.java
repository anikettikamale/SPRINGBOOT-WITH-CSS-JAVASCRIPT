package com.practise.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
@GetMapping("/about")		
public String about(Model model)
{
	System.out.println("inside about handler");
	model.addAttribute("name","durgesh");
	model.addAttribute("currentDate",new Date(0));
	
	return "about";
	//about.html	
	}	

//handling iteration 

//looping done 

@GetMapping("/anu-loop")
public String iterateHandler(Model m)
{
  List<String> names=List.of("anu","manu","ronu");	
	
	m.addAttribute("names",names);
	return "iterate";
}










}
