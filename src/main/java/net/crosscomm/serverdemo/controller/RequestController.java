package net.crosscomm.serverdemo.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import net.crosscomm.serverdemo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value = "/noderequest", method = RequestMethod.GET)
    public String handleShortRequest(Principal principal, HttpServletRequest request, Model model) throws Exception {
		demoService.updateCriticalData();
		demoService.updateSideEffectData();
		demoService.notifyUsersOfUpdate();
		return "index";
    }
	
	@RequestMapping(value = "/workerrequest", method = RequestMethod.GET)
    public String handleMediumRequest(Principal principal, HttpServletRequest request, Model model) throws Exception {
		demoService.updateCriticalData();
		demoService.sendToWorkers();
		return "index";
    }
}
