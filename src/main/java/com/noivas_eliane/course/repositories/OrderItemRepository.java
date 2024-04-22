package com.noivas_eliane.course.repositories;

import com.noivas_eliane.course.entities.OrderItem;
import com.noivas_eliane.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}
