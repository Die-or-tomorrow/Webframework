package com.rearend.repository;

import com.rearend.entity.Student;
import com.rearend.entity.Teacher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherRepository extends BaseRepository<Teacher,Integer> {
	//@Query("update Teacher teacher set teacher.name="王波" ")



	@Modifying
	@Query("update Teacher teacher set teacher.passWord=:passWord where teacher.name=:name")
	void updatePassWord(@Param("name")String name,@Param("passWord") String passWord);

	@Modifying
	@Query("")
    void updateOthers();

	@Query("update MajorFieldLeaning set leaning=:leaning where student.name=:studentName")
	void updateLeaning(@Param("leaning") String leaning,@Param("studentName") String studentName);

	@Query("update Course set courseName=:courseName,weighting=:weighting")
	void creatCourse(@Param("courseName") String courseName,@Param("weighting") float weighting);


	@Query("")
	void addGradeList();

	@Query("")
	void update();

	@Query("select studentID from Student where confirmed=true ")
	List<Student> confirmedStudentList();

	@Query("update Teacher set maxGuideNumbers=:maxGuideNumbers")
	void updateMax(@Param("maxGuideNumbers")int maxGuideNumbers);

	@Query("select maxGuideNumbers from Teacher ")
	int findMaxByName();




}
