package org.ssm.mvn.duboo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.ssm.mvn.dubbo.api.entity.UserEntity;
import org.ssm.mvn.dubbo.api.service.IUserService;

//import com.alibaba.dubbo.config.annotation.Reference;

@Controller
@RequestMapping("/view")
public class WebController {
	
	//dubbo.xml配置了可以使用注解时，才能使用@reference注解
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/home/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Object home(@PathVariable("id") Long id) {
		UserEntity user = userService.getUserInfo(id);
		return user;
	}
	
	/**
	 * spring mvc 返回到指定login.jsp页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String home(Model model) {
		model.addAttribute("userName","userName-");
		model.addAttribute("orderDesc", "orderDesc-");
		return "login";
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("orderId", 3437);
		mv.setViewName("index");
		return mv;
	}
}
