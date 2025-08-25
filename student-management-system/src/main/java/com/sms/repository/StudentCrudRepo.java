package com.sms.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.sms.entity.Student;

@Repository
public interface StudentCrudRepo extends ListCrudRepository<Student, Long> {

}
