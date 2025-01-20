package com.enviro.assessment.grad001.ThobaniMabaso.service;

import com.enviro.assessment.grad001.ThobaniMabaso.model.WasteCategory;
import com.enviro.assessment.grad001.ThobaniMabaso.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryService {

    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    public List<WasteCategory> getAllCategories() {
        return wasteCategoryRepository.findAll();
    }

    public Optional<WasteCategory> getCategoryById(Long id) {
        return wasteCategoryRepository.findById(id);
    }

    public WasteCategory saveCategory(WasteCategory category) {
        return wasteCategoryRepository.save(category);
    }

    public WasteCategory updateCategory(Long id, WasteCategory category) {
        category.setId(id);
        return wasteCategoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        wasteCategoryRepository.deleteById(id);
    }
}
