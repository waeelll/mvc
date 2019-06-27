package com.stock.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mvc.services.ICategoryService;

import com_stock_mvc_entities.Category;

@Controller
@RequestMapping(value="./category")
public class CatergoryController {
	
	private ICategoryService categoryService;
	
	@RequestMapping(value="/")
	public String category (Model model) {
		
		List<Category> category= categoryService.selectAll();
		
		if (category==null) {
			category= new ArrayList<Category>();
		}
	
		model.addAttribute("category", category);
		return "category/category";
	}
	
}
