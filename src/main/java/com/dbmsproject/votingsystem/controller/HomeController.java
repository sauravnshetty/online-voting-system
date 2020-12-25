package com.dbmsproject.votingsystem.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	public ModelAndView showVotePage(@RequestParam("id") Integer eid, HttpServletRequest request) {
		ModelAndView electionView = new ModelAndView();
		
		Election election =  electionService.getById(eid);
		List<Candidate> candidateList = candidateService.getByElection(election);
		electionView.addObject("election", election);
		electionView.addObject("candidateList", candidateList);
		
		if(election.geteStatus() == true) {
			electionView.setViewName("vote");
		}
		else {
			Collections.sort(candidateList, new SortByVotes());
			
			List<Candidate> winners = new ArrayList<Candidate>();
			List<Candidate> others = new ArrayList<Candidate>();

			for(Candidate cd : candidateList) {
				System.out.println(cd);
			}
			
			int maxvotes = candidateList.get(0).getNoOfVotes();
			for(int i = 0; i < candidateList.size(); i++) {
				if(candidateList.get(i).getNoOfVotes() == maxvotes) {
					winners.add(candidateList.get(i));
				}
				else {
					others.add(candidateList.get(i));
				}
			}
			
			electionView.addObject("winners", winners);
			electionView.addObject("others", others);

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

