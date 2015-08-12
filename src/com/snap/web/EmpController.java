package com.snap.web;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snap.dao.DaoI;
         
import com.snap.entity.Movie;

@Controller
public class EmpController {
	
	private DaoI dao;
	
	//setter for DI 
	@Autowired
	public void setDao(DaoI dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="viewAll.htm", method=RequestMethod.GET)
	public String viewAllEmps(Model model){
		
		List<Movie> set=dao.getMovies();
		model.addAttribute("elist", set);
		return "EmpView";
	}
	
}
