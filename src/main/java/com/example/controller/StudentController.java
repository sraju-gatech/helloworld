package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.StudentResponse;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

	@Value("${Student.Name:Saminathan}")
	private String studName;
	@Value("${Region:USA}")
	private String studRegion;
	@Value("${Age:22}")
	private String studAge;

	
	@GetMapping("/get")
	//@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getStudent () {
		//StudentResponse studentResponse = new StudentResponse(1, "John", "Smith");
		//This comment is with Branch A
		return studName +" "+studRegion+ " " +studAge; //studentResponse;
	}
}
