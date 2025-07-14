package com.studentmanagement.studentmanagementsystem.service;

import com.studentmanagement.studentmanagementsystem.entity.Student;
import com.studentmanagement.studentmanagementsystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

     public Student saveStudent(Student student)
    {
        return studentRepo.save(student);
    }

    public Student getStudentById(Integer id) {
        Optional<Student> byId = studentRepo.findById(id);
        return byId.orElse(null);  // value mil gaya toh return, warna null
    }
    public  Student updateStudent(Integer id,Student student)
    {
        Optional<Student> byId=studentRepo.findById(id);
        Student db=null;
        if(byId.isPresent())
        {
             db=byId.get();
            db.setAge(student.getAge());
            db.setName(student.getName());
            db.setCourse(student.getCourse());
            studentRepo.save(db);
        }
        else{
            System.out.println("Student not found");
        }
        return  db;
    }


    public Student partialUpdate(Integer id, Student student) {
        Optional<Student> byId = studentRepo.findById(id);
        Student partialUpd = null;

        if (byId.isPresent()) {
            partialUpd = byId.get();

            // Null check: agar client ne kuch field nahi bheji ho to purana value chhod do
            if (student.getAge() != 0) partialUpd.setAge(student.getAge());
            if (student.getName() != null) partialUpd.setName(student.getName());
            if (student.getCourse() != null) partialUpd.setCourse(student.getCourse());

            //  DB me save karna mat bhoolna
            partialUpd = studentRepo.save(partialUpd);
        } else {
            System.out.println("Student not exist");
        }

        return partialUpd;
    }

    public  Student remove(Integer id)
    {
        Student db=null;
        Optional<Student> byId=studentRepo.findById(id);
        if(byId.isPresent()) studentRepo.deleteById(id);
        return db;
    }

}
