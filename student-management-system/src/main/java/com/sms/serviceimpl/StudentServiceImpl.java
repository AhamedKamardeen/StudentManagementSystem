package com.sms.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentCrudRepo;
import com.sms.repository.StudentJPARepo;
import com.sms.repository.StudentpageRepo;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentCrudRepo studentCrudRepo;
	@Autowired
	StudentpageRepo studentpageRepo;
	@Autowired
	StudentJPARepo studentJPARepo;
	@Override
	public List<Student> getAllStudent() {
		List<Student> studentList = studentCrudRepo.findAll();
		return studentList;
	}

	@Override
	public Map saveStudent(Student student) {
		Map<String, String> response = new HashMap<>();
			studentCrudRepo.save(student);
			response.put("Status", "Success");
		return response;
	}

	@Override
	public Iterable<Student> getstudentByPage(int page , int size) {
		return studentpageRepo.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Student> getStudentbyJpa(String name) {
			return studentJPARepo.getByNameLike(name);
	}

}
