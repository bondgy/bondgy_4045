package com.uc.startapp.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WebController {

	@RequestMapping(method=RequestMethod.GET, path="/index")
	private static void defaultMapping() {
		
	}
}
