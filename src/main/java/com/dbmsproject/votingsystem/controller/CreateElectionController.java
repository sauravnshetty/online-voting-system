package com.dbmsproject.votingsystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dbmsproject.votingsystem.model.Election;
import com.dbmsproject.votingsystem.model.User;
import com.dbmsproject.votingsystem.service.ElectionService;

@Controller
public class CreateElectionController {

	//TODO: add session user check for all views/pages
	
	@Autowired
	ElectionService electionService;
	
	@RequestMapping(value = "/saveelection", method = RequestMethod.POST)
	public ModelAndView registerElection(@RequestParam String name, @RequestParam String noOfCandidates, @RequestParam String candidateList,
			@RequestParam String password, HttpServletRequest request) {
		
		System.out.println("election saved");
		//noOfCandidates = Integer.parseInt(noOfCandidates);
	
		Election newElection = new Election();
		newElection.setEname(name);
		newElection.setePassword(password);
		newElection.setAdmin((User)request.getSession().getAttribute("user"));
		newElection.seteStatus(true);
		newElection.setNoOfCandidates(Integer.parseInt(noOfCandidates));
		newElection.setNoOfVoters(0);
		
		electionService.save(newElection);
		
		
		String[] candidates = candidateList.split(",", Integer.parseInt(noOfCandidates));
		
		
		
		for(int i = 0; i < Integer.parseInt(noOfCandidates); i++) {
			
		}
		
		ModelAndView home = new ModelAndView("home");
		home.addObject("user", newElection.getAdmin());
		home.addObject("electionList", electionService.getAllElections());
		return home;
	}
}
