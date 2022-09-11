package com.tutorapp.service;

import com.tutorapp.model.Category;

public interface ICategoryService {


    Category addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(int categoryId);
    Category getById(int categoryId);


}
