package com.richardevaristo.springJpaTest.OneToMany.service;

import com.richardevaristo.springJpaTest.OneToMany.dao.CategoryRepository;
import com.richardevaristo.springJpaTest.OneToMany.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService  {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return null;
    }

    public Category getCategoryById(int id) {
        return null;
    }

}
