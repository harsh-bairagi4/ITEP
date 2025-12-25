package com.harsh.test.controller;

import com.harsh.test.entity.Student;
import com.harsh.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        try{
            Student savedStudent = studentService.saveStudent(student);
            return ResponseEntity.status(201).body(savedStudent);
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentByID(@PathVariable int id){
        try{
            Student student = studentService.getStudentById(id);
            if(student == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.status(200).body(student);
        } catch (Exception e) {
           return  ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<Student>> getAllUsers() {
        try{
            List<Student> studentList = studentService.getAllStudent();
            if(studentList == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.status(200).body(studentList);
        }
        catch (Exception e){
            return  ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable int id){
        try{
            Student student = studentService.removeStudent(id);
            if(student != null){
                return ResponseEntity.status(200).body(student);
            }
           return ResponseEntity.notFound().build();
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id ,@RequestBody Student student){
        try{
            Student existingStudent = studentService.updateStudent(id, student);
            if(existingStudent == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(existingStudent);
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Student> activeStudent(@PathVariable int id, @RequestParam String active){
        try{
            Student existingStudent = studentService.activeStudent(id, active);
            if(existingStudent == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(existingStudent);

        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }

    }

}
