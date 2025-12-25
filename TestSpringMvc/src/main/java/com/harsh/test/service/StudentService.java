package com.harsh.test.service;

import com.harsh.test.entity.Student;
import com.harsh.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public Student removeStudent(int id){
        Student existingStudent = getStudentById(id);
        if(existingStudent != null){
            studentRepository.deleteById(id);
            return existingStudent;
        }
        return null;
    }
    public Student updateStudent(int id, Student student){
       Student existingStudent = getStudentById(id);
       if(existingStudent != null){
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setPhone(student.getPhone());
            existingStudent.setActive(student.getActive());
            return studentRepository.save(existingStudent);
       }
       return null;
    }
    public Student activeStudent(int id, String active){
        Student existingStudent = studentRepository.findById(id).orElse(null);;
        if(existingStudent != null){
            existingStudent.setActive(active);
            return studentRepository.save(existingStudent);
        }
        return null;

    }
}
