package com.mahrukh;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentClasscontroller {
	@Autowired
	StudentRespository repo;
	
	

	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		
		Student a = repo.getOne(id);
		
		repo.delete(a);
		return "deleted"; 
		
	}
	
	@PutMapping(path="/student",consumes= {"application/json"})
	public Student updateStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}
	
	@PostMapping(path="/student",consumes= {"application/json"})
	public Student addStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}
	
	
	@GetMapping(path="students")
	public List<Student> getStudentinfo(){
		return repo.findAll();
	}
	
	@RequestMapping("student/{id}")
	public Optional<Student> getStudentinfom(@PathVariable("id") int id){
		return repo.findById(id);
	}
	
	
	
	
}
