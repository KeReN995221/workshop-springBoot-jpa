package com.noivas_eliane.course.repositories;

import com.noivas_eliane.course.entities.Category;
import com.noivas_eliane.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
