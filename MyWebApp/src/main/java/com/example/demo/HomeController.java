package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller // this annotation make this class work as controller 
public class HomeController 
{
	@RequestMapping("home") // in URL we sent request for home, so our controller find home request bcoz of @requestMapping annotation
	public ModelAndView home(Alien alien) // now client sending multiple data so insist of writing @Requestparam 3 times and accept data we use object to accept multiple data.
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home.jsp");
		return mv; // this is automatically search page in webapp folder bcoz internally it mentioned that way, if you use different location for jsp pages then you need to configure that location
	}

}
