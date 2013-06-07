package fr.jvallin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.jvallin.model.Geek;
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
		mv.addObject("geeks", service.findByPseudo(pseudo));
		mv.setViewName("list");
		
		return mv;
	}
	
	
	@RequestMapping(value = "searchSexe", method = RequestMethod.GET)
	public ModelAndView showSearchSexe(@RequestParam String radioBouton, String[] combo)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("geeks", service.findByInteret(radioBouton, combo));
		mv.setViewName("list");
		
		return mv;
	}
	
	@RequestMapping(value = "searchJDLC", method = RequestMethod.GET)
	public ModelAndView showSearchJDLC()
	{
		int random = (int)(Math.random() * (11-1)) + 1;
		
		String id = random+"";
		
		Geek geek = updateNbVus(id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("geek", geek);
		mv.addObject("max", service.findMaxVues());
		mv.setViewName("detail");
		
		return mv;
	}
	
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView showDetail(@RequestParam(required = true, value="id") String id)
	{
		Geek geek = updateNbVus(id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("geek", geek);
		mv.addObject("max", service.findMaxVues());
		mv.setViewName("detail");
		
		return mv;
	}
	
	// méthode qui gère le nombre de vues
	public Geek updateNbVus(String id)
	{
		Geek geek = service.findById(id);
		
		geek.setNbvus(geek.getNbvus()+1);
		
		service.updateNbVus(geek);
		
		return geek;
	}
}
