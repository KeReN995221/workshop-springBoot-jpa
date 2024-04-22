package com.noivas_eliane.course.repositories;

import com.noivas_eliane.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
