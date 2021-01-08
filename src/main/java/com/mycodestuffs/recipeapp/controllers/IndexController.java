package com.mycodestuffs.recipeapp.controllers;

import com.mycodestuffs.recipeapp.domain.Category;
import com.mycodestuffs.recipeapp.domain.UnitOfMeasure;
import com.mycodestuffs.recipeapp.repositories.CategoryRepository;
import com.mycodestuffs.recipeapp.repositories.UnitOfMeasureRepository;
import com.mycodestuffs.recipeapp.services.RecipeService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","","/index","/home"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
