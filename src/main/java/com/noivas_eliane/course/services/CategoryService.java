package com.noivas_eliane.course.services;

import com.noivas_eliane.course.entities.Category;
import com.noivas_eliane.course.entities.Order;
import com.noivas_eliane.course.entities.User;
import com.noivas_eliane.course.repositories.CategoryRepository;
import com.noivas_eliane.course.repositories.OrderRepository;
import com.noivas_eliane.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> category = repository.findById(id);
        return category.get();
    }
}
