package com.microservices.studentservice.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.microservices.studentservice.Entity.Student;
import com.microservices.studentservice.Repository.StudentsRepo;

@Service
public class StudentService {

  @Autowired
  private StudentsRepo studentsRepo;

  public Student createStudent(Student student){
    return studentsRepo.save(student);
  }

public List<Student> getAllStudents() {
	// TODO Auto-generated method stub
	return studentsRepo.findAll();
}
}
