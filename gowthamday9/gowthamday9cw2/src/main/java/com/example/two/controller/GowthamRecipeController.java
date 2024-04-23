package com.example.two.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.two.model.GowthamRecipe;
import com.example.two.service.GowthamRecipeService;



@RestController
@RequestMapping("/api")
public class GowthamRecipeController {
    
    @Autowired
    public GowthamRecipeService recipeService;

    @PostMapping("/recipe")
    public GowthamRecipe savEntity(@RequestBody GowthamRecipe recipe)
    {
        return recipeService.saveRecipe(recipe);
    }

    @GetMapping("/recipe/{recipeId}")
    public GowthamRecipe getId(@PathVariable("recipeId") int a)
    {
        return recipeService.getByRecipe(a);
    }

    @GetMapping("/recipe/byname")
    public List<GowthamRecipe> getAlls(@RequestParam String b)
    {
        return recipeService.getAll(b);
    }
}
