package com.sms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Records;
import com.sms.entity.Student;
import com.sms.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

		private StudentService studentService;
		
		public StudentController(StudentService studentService) {
			this.studentService=studentService;
		}
		
		@GetMapping("/get-all-student")
		public List<Student> getAllStudent(){
			List<Student> studentList = studentService.getAllStudent();
			System.out.println("hi");
			return studentList;
		}
		
		@PostMapping("/save-student")
		public Map saveStudent(@RequestBody Student student){
			Map response = new HashMap<>();
			response = studentService.saveStudent(student);
			return response;
		}
		
		@GetMapping("/get-student-by-page")
		public Iterable<Student> getStudentByPage(@RequestParam int page , @RequestParam int size){
			return studentService.getstudentByPage(page , size);
		}
		
		@GetMapping("/get-student-by-jpa")
		public List<Student> getStudentbyJpa(@RequestParam String name){
			return studentService.getStudentbyJpa(name);
		}
		
		@PostMapping("/save-records/{id}/record")
		public Map saveRecords(@PathVariable ("id") long  id , @RequestBody Records record) {
			return studentService.saveRecords(id, record);
		}
		
}
