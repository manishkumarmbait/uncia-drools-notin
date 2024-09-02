package com.unciadroolsnotin.service;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unciadroolsnotin.model.Person;
import com.unciadroolsnotin.model.Response;

@Service
public class NotInService {

	@Autowired
	private KieContainer kieContainer;

//	public Rate getRate(Participant applicantRequest) {
//		Rate rate = new Rate();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("rate", rate);
//		kieSession.insert(applicantRequest);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return rate;
//	}

//	public Response getResponse(Cibil cibil) {
//		Response response = new Response();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("response", response);
//		kieSession.insert(cibil);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return response;
//	}
	
	
	public Response getResponse(List<Person> listOfPerson) {
		
//		List<Integer> list = new ArrayList<>();
//		list.add(45);
//		list.add(46);
//		list.add(47);
//		list.add(48);
//		list.add(49);
//		list.add(50);
//		list.add(51);
		Response response = new Response();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("response", response);
		kieSession.insert(listOfPerson);
//		kieSession.insert(list);
		kieSession.fireAllRules();
		kieSession.dispose();
		return response;
	}
	
	
	
	
//	public Response getResponse(List<Deviation> guarantorList) {
//		Response response = new Response();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("response", response);
//		kieSession.insert(guarantorList);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return response;
//	}
//	
	
	
}
