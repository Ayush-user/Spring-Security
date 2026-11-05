package SpringSecurityT.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringSecurityT.entity.Student;

@RestController
public class StudentController {

	List<Student> students=new ArrayList<>();
	Student s1=new Student(1,"Abc",25);
	Student s2=new Student(2,"Xzy",30);

	
	@GetMapping("/students")
	public List<Student> getStudent() {
		students.add(s1);
		students.add(s2);
		return students;
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}
}
