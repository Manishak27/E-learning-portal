
package com.courses.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.demo.dao.CoursesDao;
import com.courses.demo.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CoursesDao coursesDao;  
	
	public CourseServiceImpl() {
		
	}
	
	//get
	@Override
	public List<Course> getCourses()
	{
		return coursesDao.findAll();
	}
	
   //get by id
	@Override
	public Course getCourse(long id) {			
		
		 Optional<Course> course=null;
	
		 try {
			course= this.coursesDao.findById(id);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return course.get();
		
	}
	
	//post
	@Override
	public Course addCourse(Course course) {
		
		Course newCourse=coursesDao.save(course);
		return newCourse;
	} 
	
	//put
	@Override
	public Course updateCourse(Course course) {  
	
			coursesDao.save(course);
				return course;
		 }
	
	//delete
	@Override
	public void deleteCourse(long parseLong) {

		Course entity= coursesDao.getReferenceById(parseLong);
		coursesDao.delete(entity);
	}

}
