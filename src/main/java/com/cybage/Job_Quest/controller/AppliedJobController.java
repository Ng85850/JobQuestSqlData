package com.cybage.Job_Quest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppliedJobController {

	@RequestMapping(value = "/application_history")
	public ModelAndView appliedJob(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return new ModelAndView("application_history");
	}
}
