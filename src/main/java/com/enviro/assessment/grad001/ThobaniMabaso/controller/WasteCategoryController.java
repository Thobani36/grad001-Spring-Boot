package com.enviro.assessment.grad001.ThobaniMabaso.controller;

import com.enviro.assessment.grad001.ThobaniMabaso.model.WasteCategory;
import com.enviro.assessment.grad001.ThobaniMabaso.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {

    @Autowired
    private WasteCategoryService wasteCategoryService;

    @GetMapping
    public List<WasteCategory> getAllCategories() {
        return wasteCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<WasteCategory> getCategoryById(@PathVariable Long id) {
        return wasteCategoryService.getCategoryById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public WasteCategory createCategory(@RequestBody @Valid WasteCategory category) {
        return wasteCategoryService.saveCategory(category);
    }

    @PutMapping("/{id}")
    public WasteCategory updateCategory(@PathVariable Long id, @RequestBody @Valid WasteCategory category) {
        return wasteCategoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteCategory(id);
    }
}
