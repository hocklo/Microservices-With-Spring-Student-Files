/**
 * 
 */
package com.springbootcourse.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hocklo
 * This class is a controller for Lab1SimpleWebApplication.
 */
@Controller
public class Lab1SimpleWebController {
	
	@RequestMapping("/")
	public String simple(){
		return "hello";
	}
}
