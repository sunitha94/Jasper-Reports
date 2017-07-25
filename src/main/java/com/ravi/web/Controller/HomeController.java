package com.ravi.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String getHello(Model model){
		String str="Hello Ravi";
		model.addAttribute("hello",str);
		return "hello";
	}

}
