package com.springrepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springentity.*;

public interface Repositories extends JpaRepository<Student, Long>{

}