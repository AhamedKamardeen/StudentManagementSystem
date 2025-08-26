package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sms.entity.Records;
import com.sms.entity.Student;

public interface RecordJPARepo extends JpaRepository<Records, Long>{
	
	
}
