package com.luv2code.springdemo.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}

	/*
	 * @RequestMapping("/processForm2") public String letsAct(HttpServletRequest
	 * request, Model model) {
	 * 
	 * // read the request parameter from the HTML file String name =
	 * request.getParameter("studentName"); String address =
	 * request.getParameter("address");
	 * 
	 * // convert the data to all caps name=name.toUpperCase();
	 * address=address.toUpperCase();
	 * 
	 * // create the message String result = "Hello " + name + " from " +
	 * address;
	 * 
	 * // add message to the model model.addAttribute("message", result);
	 * 
	 * return "helloworld"; }
	 */

	@RequestMapping("/processForm3")
	// public String letsAct3( @RequestParam("studentName") String name, Model
	// model){
	public String letsAct3(@RequestParam Map<String, String> reqParams, Model model) {
		String name = reqParams.get("studentName");
		String address = reqParams.get("address");

		// convert the data to all caps
		name = name.toUpperCase();
		address = address.toUpperCase();

		// create the message
		String result = "Hello my friend " + name + " from " + address;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

}
