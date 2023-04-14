package com.courses.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.demo.entities.Course;

public interface CoursesDao extends JpaRepository<Course, Long>{

}
