package com.microservices.studentservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.studentservice.Entity.Student;

@Repository
public interface StudentsRepo extends JpaRepository<Student,Long>{

}
