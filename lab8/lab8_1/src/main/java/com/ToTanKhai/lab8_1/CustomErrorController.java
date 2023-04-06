package com.ToTanKhai.lab8_1;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public String errorPage(HttpServletRequest httpRequest, Model model) {
		String errorMsg ="";
		int httpErrorCode = getErrorCode(httpRequest);
		switch(httpErrorCode){
			case 400:{
				errorMsg ="Http Error Code: 400. Bad Request";
				break;
			}
			case 401:{
				errorMsg ="Http Error Code: 401. Unauthorized";
				break;
			}
			case 404:{
				errorMsg ="Http Error Code: 404. Resource not found";
				break;
			}
			case 500:{
				errorMsg ="Http Error Code: 500. Internal server error";
				break;
			}
			default:{
				errorMsg ="Unknown error occurred. Please try again later.";
			}
		}
		model.addAttribute("errorMsg", errorMsg);
		return "errorPage";
	}
	
	private int getErrorCode(HttpServletRequest httpRequest) {
		return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
	}

}