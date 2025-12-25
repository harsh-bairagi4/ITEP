package com.harsh.test.service;

import com.harsh.test.entity.Course;
import com.harsh.test.entity.Student;
import com.harsh.test.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    @Autowired
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }
    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
    public Course getCourseById(int id){
        return courseRepository.findById(id).orElse(null);
    }
    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }
    public Course removeCourse(int id){
        Course existingCourse = getCourseById(id);
        if(existingCourse != null){
            courseRepository.deleteById(id);
            return existingCourse;
        }
        return null;
    }
    public Course updateCourse(int id, Course course){
        Course existingCourse = getCourseById(id);
        if(existingCourse != null){
            existingCourse.setTitle(course.getTitle());
            existingCourse.setDuration(course.getDuration());
            existingCourse.setLevel(course.getLevel());
            return courseRepository.save(existingCourse);
        }
        return null;
    }
}
