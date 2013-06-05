package fr.jvallin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.jvallin.service.IService;

@Controller
@RequestMapping("/")
public class GeekController
{
	
	@Autowired
	public IService service;
	
	public GeekController(){
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String show()
	{
		return "search";
	}
	
	@RequestMapping(value = "searchPseudo", method = RequestMethod.GET)
	public ModelAndView showSearchPseudo(@RequestParam String pseudo)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("spectacles", service.findByPseudo(pseudo));
		mv.setViewName("list");
		
		return mv;
	}
	
	
	@RequestMapping(value = "searchSexe", method = RequestMethod.GET)
	public ModelAndView showSearchSexe(@RequestParam String radioBouton)
	{
		ModelAndView mv = new ModelAndView();
		if(radioBouton.equals("D"))
		{
			mv.addObject("spectacles", service.findAll());
		}
		else
		{
			mv.addObject("spectacles", service.findBySexe(radioBouton));
		}
		mv.setViewName("list");
		
		return mv;
	}
	
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView showDetail(@RequestParam(required = true, value="id") String id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("spectacle", service.findById(id));
		mv.setViewName("detail");
		
		return mv;
	}
}
