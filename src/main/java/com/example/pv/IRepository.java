package com.example.pv;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<Student, Integer> {
}
