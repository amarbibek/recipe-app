package com.mycodestuffs.recipeapp.controllers;

import com.mycodestuffs.recipeapp.domain.Category;
import com.mycodestuffs.recipeapp.domain.UnitOfMeasure;
import com.mycodestuffs.recipeapp.repositories.CategoryRepository;
import com.mycodestuffs.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"/","","/index","/home"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Category Id:"+categoryOptional.get().getId());
        System.out.println("UOM Id:"+unitOfMeasureOptional.get().getId());

        return "index";
    }
}
