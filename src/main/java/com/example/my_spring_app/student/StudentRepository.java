package com.example.my_spring_app.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String> {

}
