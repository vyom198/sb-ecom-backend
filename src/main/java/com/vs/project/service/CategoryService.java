package com.vs.project.service;

import com.vs.project.model.Category;
import com.vs.project.payload.CategoryDTO;
import com.vs.project.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory (Long categoryId);
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
