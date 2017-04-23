package com.spring4.mvc.linnyk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring4.mvc.linnyk.model.Event;

@Controller
public class EventController {

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public String displayEventPage(Model model) {
		final Event event = new Event("Java user group");

		model.addAttribute("event", event);

		return "event";
	}
}
