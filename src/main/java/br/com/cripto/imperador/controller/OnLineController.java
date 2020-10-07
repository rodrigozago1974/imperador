package br.com.cripto.imperador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OnLineController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "{status: On-Line }";
	}

}
