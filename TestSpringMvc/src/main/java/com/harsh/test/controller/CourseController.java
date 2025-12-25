package com.harsh.test.controller;

import com.harsh.test.entity.Course;
import com.harsh.test.entity.Student;
import com.harsh.test.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }
    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        try{
            Course savedCourse = courseService.saveCourse(course);
            return ResponseEntity.status(201).body(savedCourse);
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseByID(@PathVariable int id){
        try{
            Course course = courseService.getCourseById(id);
            if(course == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.status(200).body(course);
        } catch (Exception e) {
            return  ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourse() {
        try{
            List<Course> courseList = courseService.getAllCourse();
            if(courseList == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.status(200).body(courseList);
        }
        catch (Exception e){
            return  ResponseEntity.internalServerError().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Course> deleteStudent(@PathVariable int id){
        try{
            Course course = courseService.removeCourse(id);
            if(course != null){
                return ResponseEntity.status(200).body(course);
            }
            return ResponseEntity.notFound().build();
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable int id ,@RequestBody Course course){
        try{
            Course existingCourse = courseService.updateCourse(id, course);
            if(existingCourse == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(existingCourse);
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
