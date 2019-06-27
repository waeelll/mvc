package com.stock.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mvc.services.IClientService;

import com_stock_mvc_entities.Client;

@Controller
@RequestMapping(value="./client")
	
	public class ClientController {
	
	@Autowired
	 private IClientService clientService;
	 
	 @RequestMapping(value="/")
	 public String client(Model model) {
		 
		 List<Client> clients= clientService.selectAll();
		 
		 if(clients ==null) {
			 clients = new ArrayList<Client>();
			 
			 
			 
		 }
		 
		 model.addAttribute("clients", clients);
		 
		 return "client/client";
	 }
}
