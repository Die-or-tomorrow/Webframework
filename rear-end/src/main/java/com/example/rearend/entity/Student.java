package com.example.rearend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Student {
	@Id
	private String studentID;
	private String name;
	private String gender;
	private Boolean confirmed=false;  //是否被确认指导，默认否
	private String contactInformation;
	@OneToMany(mappedBy = "student")       //和课程之间的关系
    private List<Course>  completedCourses;     //已修课程；
	@OneToMany(mappedBy = "student")
	private List<MajorFieldLeaning>  majorFieldLeanings;   //专业方向；
	@ManyToOne					//和导师之间的关系
	private Teacher teacher;


}
