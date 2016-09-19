package demo01.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface Controller {
	String handleRequest(HttpServletRequest request, 
			HttpServletResponse response);
}

