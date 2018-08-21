package com.aspiresys.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aspiresys.model.Person;
import com.aspiresys.service.PersonService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		List<Person> listPersons = personService.list();
		ModelAndView model = new ModelAndView("PersonList");
		model.addObject("personList", listPersons);
		return model;
	}
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		ModelAndView model = new ModelAndView("PersonForm");
		model.addObject("person", new Person());
		return model;		
	}
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		int personId = Integer.parseInt(request.getParameter("id"));
		Person person = personService.get(personId);
		ModelAndView model = new ModelAndView("PersonForm");
		model.addObject("person", person);
		return model;		
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int personId = Integer.parseInt(request.getParameter("id"));
		personService.delete(personId);
		return new ModelAndView("redirect:/");		
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView savePerson(@ModelAttribute Person person) {
		personService.saveOrUpdate(person);
		return new ModelAndView("redirect:/");
	}
}
