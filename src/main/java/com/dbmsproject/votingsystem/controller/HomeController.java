package com.dbmsproject.votingsystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/showelection", method=RequestMethod.GET)
	public ModelAndView showVotePage(@RequestParam("id") Integer eid) {
		ModelAndView votePage = new ModelAndView("vote");
		return votePage;
	}
	
	@RequestMapping(value="/create")
	public ModelAndView showCreate(HttpServletRequest request) {
		ModelAndView createPage = new ModelAndView("createElection");
		createPage.addObject("user", request.getSession().getAttribute("user"));
		return createPage;
	}
}
