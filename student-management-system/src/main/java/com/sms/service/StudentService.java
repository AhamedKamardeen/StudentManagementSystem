package com.sms.service;
import java.util.List;
import java.util.Map;

import com.sms.entity.Records;
import com.sms.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();

	public Map saveStudent(Student student);

	public Iterable<Student> getstudentByPage(int page , int size);

	public List<Student> getStudentbyJpa(String name);

	public Map saveRecords(long id, Records record);
}
