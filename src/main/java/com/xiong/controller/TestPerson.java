package com.xiong.controller;

import com.xiong.entity.Person;
import com.xiong.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestPerson {
	@Autowired
	private Person person;
	@Autowired
	IPersonService personService;
	
	@RequestMapping("hello")
	public String hello(ModelMap map){
		
		map.put("person", person);
		
		List<Person> personList = personService.list();
		map.put("personList", personList);
		
		return "index";
	}
	
}
