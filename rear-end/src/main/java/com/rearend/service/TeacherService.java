package com.rearend.service;

import com.rearend.entity.Student;
import com.rearend.entity.Teacher;
import com.rearend.repository.StudentRepository;
import com.rearend.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherService  {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TeacherRepository teacherRepository;

	void addAffirmStudent(){
		List<Student> student=teacherRepository.confirmedStudentList();
		for (Student i:
			 student) {
             studentRepository.save(i);
		}
        if (student!=null) teacherRepository.updateMax(teacherRepository.findMaxByName()-1);
	}

}
