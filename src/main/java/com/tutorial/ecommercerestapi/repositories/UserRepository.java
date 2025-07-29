package com.tutorial.ecommercerestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tutorial.ecommercerestapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
