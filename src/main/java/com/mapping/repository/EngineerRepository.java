package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer,Integer> {
}