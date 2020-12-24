package com.dbmsproject.votingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminElectionController {

	@RequestMapping(value="/showresults", method=RequestMethod.GET)
	public ModelAndView showResultPage(@RequestParam("eid") Integer eid) {
		return new ModelAndView("result");
	}
}
