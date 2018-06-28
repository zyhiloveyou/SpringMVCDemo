package com.chaoqian;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainTest {
	@RequestMapping("/page")
	public String frontPage(HttpServletRequest req,Model model) {
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		model.addAttribute("username",user);
		model.addAttribute("password", pass);
System.out.println(user+pass);
		return "page";
	}
}

