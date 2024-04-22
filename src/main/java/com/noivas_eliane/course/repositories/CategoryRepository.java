package com.noivas_eliane.course.repositories;

import com.noivas_eliane.course.entities.Category;
import com.noivas_eliane.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {


}
