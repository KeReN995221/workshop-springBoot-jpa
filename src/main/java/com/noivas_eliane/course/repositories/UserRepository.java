package com.noivas_eliane.course.repositories;

import com.noivas_eliane.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
