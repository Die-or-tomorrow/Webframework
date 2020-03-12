package com.example.rearend.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Course {
	@Id
	private String courseName;
	@ManyToOne
	private Student student;
	@ManyToOne
	private Teacher teacher;
	private int grades;

}
