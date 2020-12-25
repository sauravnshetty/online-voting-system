package com.dbmsproject.votingsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dbmsproject.votingsystem.model.Candidate;
import com.dbmsproject.votingsystem.model.Election;
import com.dbmsproject.votingsystem.model.User;
import com.dbmsproject.votingsystem.service.CandidateService;
import com.dbmsproject.votingsystem.service.ElectionService;

@Controller
public class HomeController {
	
	@Autowired
	ElectionService electionService;
	@Autowired
	CandidateService candidateService;

	@RequestMapping(value="/vote", method=RequestMethod.GET)
	public ModelAndView showVotePage(@RequestParam("id") Integer eid) {
		ModelAndView electionView = new ModelAndView();
		
		Election election =  electionService.getById(eid);
		List<Candidate> candidateList = candidateService.getByElection(election);
		electionView.addObject("election", election);
		electionView.addObject("candidateList", candidateList);
		
		if(election.geteStatus() == true) {
			electionView.setViewName("vote");
		}
		else {
			electionView.setViewName("result");
		}
		
		return electionView;
	}
	
	@RequestMapping(value="/create")
	public ModelAndView showCreate(HttpServletRequest request) {
		System.out.println(request.getSession().getAttribute("user"));
		ModelAndView createPage = new ModelAndView("createElection");
		createPage.addObject("user", request.getSession().getAttribute("user"));
		return createPage;
	}
	
	@RequestMapping(value="/adminelections")
	public ModelAndView showAdminElections(HttpServletRequest request) {
		ModelAndView adminElections = new ModelAndView("adminelections");
		
		User admin = (User)request.getSession().getAttribute("user");
		
		adminElections.addObject("user", admin);
		adminElections.addObject("adminElectionList", electionService.getByAdmin(admin));
		
		return adminElections;
	}
}
