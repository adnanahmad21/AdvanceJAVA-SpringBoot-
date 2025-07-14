package com.studentmanagement.studentmanagementsystem.controller;

import com.studentmanagement.studentmanagementsystem.entity.Student;
import com.studentmanagement.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }
//    @GetMapping
//    public Student getStudent(@RequestParam Integer id) //  @PathVariable (paramenter) and in getmapping("/{id})
//    {
//        return  studentService.getStudentById(id);
//    }
    @GetMapping("/{id}")
    public  Student getStudent(@PathVariable Integer id)
    {
        return  studentService.getStudentById(id);
    }

    @PostMapping("/save")
   public  Student  createStudent(@RequestBody Student student)
    {
        return  studentService.saveStudent(student);
    }
    @PutMapping("{id}")
    public  Student updateStudent(@PathVariable Integer id,@RequestBody Student student)
    {
     Student  updStu=studentService.updateStudent(id,student);
     return updStu;
    }
    @PatchMapping("{id}")
    public  Student partialUpdate(@PathVariable Integer id,@RequestBody Student student)
    {
        return  studentService.partialUpdate(id,student);
    }
    @DeleteMapping("{id}")
    public  Student delete(@PathVariable Integer id)
    {
        return  studentService.remove(id);

    }

}
