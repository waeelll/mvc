package com.stock.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mvc.services.IUtilisateurService;

import com_stock_mvc_entities.Utilisateur;

@Controller
@RequestMapping("/.utilisateur")
	public class UtilisateurContoller {
	
	private IUtilisateurService utilisateurService;
	
	public String utilisateur(Model model) {
	List<Utilisateur> utilisateurs= utilisateurService.selectAll();
	if (utilisateurs==null) {
		utilisateurs= new ArrayList<Utilisateur>();
	}
	
	
	model.addAttribute("utilisateurs", utilisateurs);
	return "utlisateur/utlisateur";
	}

}
