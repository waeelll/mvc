package com.stock.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mvc.services.IVenteService;

import com_stock_mvc_entities.Vente;

@Controller
@RequestMapping(value="./vente")
public class VenteController {
	
	
	@Autowired
	private IVenteService venteService;
	
	@RequestMapping(value="/")
	public String vente(Model model) {
		
		List<Vente> vente= venteService.selectAll();
		
		if(vente==null) {
			vente=new ArrayList<Vente>();
		}
		
		model.addAttribute("vente", vente);
		return "vente/vente";
	}

}
