package com.studentmanagement.studentmanagementsystem.repo;

import com.studentmanagement.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>  {

}
