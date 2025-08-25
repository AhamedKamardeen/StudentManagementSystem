package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sms.entity.Student;

public interface StudentJPARepo extends JpaRepository<Student, Long>{
	
	@Query("SELECT s FROM Student s WHERE s.name LIKE %:name%")
	public List<Student> getByNameLike(@Param("name") String name);
}
