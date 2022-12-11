package com.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.StudentService;
import com.springentity.*;
import com.springrepositories.*;

@Service
public class StudentServiceImpl implements StudentService{

	private Repositories studentRepository;
	
	public StudentServiceImpl(Repositories studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}
}
