package com.stock.mvc.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mvc.services.IFournisseurService;

import com_stock_mvc_entities.Fournisseur;

@Controller
@RequestMapping(value="./fournisseur")
public class FournisseurController {
	
	
	@Autowired
	private IFournisseurService fournisseurService;
	
	
	@RequestMapping(value="/")
	public String fournisseur(Model model) {
	
			List<Fournisseur> fournisseurs = fournisseurService.selectAll();
			if(fournisseurs==null) {
				fournisseurs=new ArrayList<Fournisseur>();
			}
			
			model.addAttribute(fournisseurs);
			return "fournisseur/fournisseur";
	}

}
