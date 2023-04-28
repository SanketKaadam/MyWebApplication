package com.example.demo;



public class Notes 
{
	/*
	 
	 1. You create any web page in webapp folder, for this we create webapp folder in src->main folder
	    in that you can create as many pages you want. 
	 2. when i try to add jsp page in webapp folder that time it not giving me jsp option to resolve this 
	    got to help-> install new software-> select from all site -> check web, xml java EE and OSGI-> next->
	    select eclips java web developer tool -> next -> finish it start to download. 
	    YT link - https://www.youtube.com/watch?v=7ilQ72xvvoE
	 3. By default spring boot not support JSP, to support JSP we need to add dependency, got to maven repo search tomcat jaspan
	    then check your version of embedded tomcat server and get same version dependency from maven and add it to POM file. Now your 
	    spring boot knows how to convert JSP to servlet   
	 4. So use save all your pages in webapp folder but this folder is public, if you want to chage location of pages from webapp folder then we
	    need to do this by using application properties file.
	    
	 5.  @Controller // this annotation make this class work as controller 
         public class HomeController 
         {
	          @RequestMapping("home") // in URL we sent request for home, so our controller find home request bcoz of @requestMapping annotation
	          public String home(HttpServletRequest req) // HttpServletRequest take input from user in req object 
	          {
		          HttpSession session = req.getSession(); // now we want to send client data to our jsp page for this we use HttpSession object.
		          String name = req.getParameter("name"); // here name variable in method that we use in URL, here client value store in name variable
		          System.out.println("hi "+ name);
		          session.setAttribute("name", name); // here we setting attributes for jsp page, it work like key-value pair, "name" key is used in jsp page
		          return "home.jsp"; // this is automatically search page in webapp folder bcoz internally it mentioned that way, if you use different location for jsp pages then you need to configure that location
	          }
           }

      6.   @RequestMapping("home") // in URL we sent request for home, so our controller find home request bcoz of @requestMapping annotation
	      public ModelAndView home(@RequestParam("name") String MyName) // @requestParam value match with varibale of URL name and link with MyName variable. insist of using HttpServletRequest we can directly take value.
	     {
		      ModelAndView mv = new ModelAndView();
		      mv.addObject("name",MyName);
		      mv.setViewName("home.jsp");
		      return mv; // this is automatically search page in webapp folder bcoz internally it mentioned that way, if you use different location for jsp pages then you need to configure that location
	      }

	 
	 */

}
