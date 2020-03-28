package com.rearend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity

public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String passWord;
	private String name;
	private int maxGuideNumbers;   //最多可指导 学生数；
	@OneToMany(mappedBy = "teacher")    //和课程之间的关系
	private List<Course> teachedCourse;   //  曾教过这届学生的课程
	@OneToMany(mappedBy = "teacher")  //和学生之间的关系
	private List<Student> students;   //已确定指导学生

	public Teacher(String name,String passWord) {
		this.name=name;
		this.passWord=passWord;
	}
}
