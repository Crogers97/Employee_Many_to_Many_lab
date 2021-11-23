package com.example.codeclan.Employee.repositories;

import com.example.codeclan.Employee.models.Department;
import com.example.codeclan.Employee.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
