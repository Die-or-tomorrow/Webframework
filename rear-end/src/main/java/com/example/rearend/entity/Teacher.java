package com.example.rearend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity

public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int maxGuideNumbers;   //最多可指导 学生个数；
	private int accpetTheLowestGrade;
	@OneToMany(mappedBy = "teacher")    //和课程之间的关系
	private List<Course> teachedCourse;   //  曾教过这届学生的课程
	@OneToMany(mappedBy = "teacher")  //和学生之间的关系
	private List<Student> students;


	public Teacher(String name,int maxGuideNumbers,int accpetTheLowestGrade){
  	this.name=name;
  	this.maxGuideNumbers=maxGuideNumbers;
  	this.accpetTheLowestGrade=accpetTheLowestGrade;
  }
}
