package com.sms.repository;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.sms.entity.Student;

public interface StudentpageRepo extends ListPagingAndSortingRepository<Student, Long> {

}
