package com.spring.investimentos.repository;

import com.spring.investimentos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//Gera o BD via JPA
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
