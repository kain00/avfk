package hu.randras.avfk.controller;

import hu.randras.avfk.model.Competition;
import hu.randras.avfk.service.CompetitionService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Hello world!
 * 
 */
@Controller
@RequestMapping("/competition")
public class CompetitionController {
	
	@Autowired
	private CompetitionService service;
	
	
	//TODO PathVar
	@RequestMapping("/save")
	public ModelAndView save(HttpServletRequest request) {
		ModelAndView mav;
		String textId = request.getParameter("textId");
		String id = request.getParameter("id");
		if (!StringUtils.hasLength(textId))  {
			String errorMsg = "Azonosító megadása kötelező!";
			mav = new ModelAndView("competition/add", "errorMsg", errorMsg);
		} else {
			String description = request.getParameter("description");
			Competition c = service.save(new Competition(StringUtils.hasLength(id) ? new Long(id) : null, textId, description));
			List<Competition> list = service.findAll();
			mav = new ModelAndView("competition/list", "competitions", list); 
		}
		return mav;
	}
	
	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) {
		List<Competition> list = service.findAll();
		return new ModelAndView("competition/list", "competitions", list);
	}
	
	@RequestMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("competition/add");
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable Long id) {
		Competition comp = service.findOne(id);
		return new ModelAndView("competition/add", "comp", comp);
	}
	
}
