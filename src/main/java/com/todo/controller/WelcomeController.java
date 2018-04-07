package com.todo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.todo.entities.Todo;
import com.todo.services.TodoService;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("home")
	public ModelAndView welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return  new ModelAndView("todo");
	}

	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcomeMessage() {
		return "Thanks";
	}

}
