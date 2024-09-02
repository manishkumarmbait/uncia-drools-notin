package com.unciadroolsnotin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unciadroolsnotin.model.Person;
import com.unciadroolsnotin.model.Response;
import com.unciadroolsnotin.service.NotInService;

@RestController
@RequestMapping("/ruleservice")
public class NotInController {

	@Autowired
	private NotInService notInService;

	@PostMapping("/getPerson")
	public ResponseEntity<Response> getRate(@RequestBody List<Person> listOfPerson) {
		Response response = notInService.getResponse(listOfPerson);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
