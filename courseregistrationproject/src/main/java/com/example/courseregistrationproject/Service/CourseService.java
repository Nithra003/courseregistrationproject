package com.example.courseregistrationproject.Service;


import com.example.courseregistrationproject.Model.Course;
import com.example.courseregistrationproject.Model.StudentRegister;
import com.example.courseregistrationproject.Repository.Courserepo;
import com.example.courseregistrationproject.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    Courserepo courserepo;

    @Autowired
    StudentRepo studentRepo;
    public List<Course> getcourselist() {
        return courserepo.findAll();

    }

    public List<StudentRegister> getstudentregisterlist() {
        return studentRepo.findAll();
    }

    public String addStudent(String username, String useremail, String coursename) {
        StudentRegister studentregister = new StudentRegister(username, useremail, coursename);
        studentRepo.save(studentregister);
        return "Created Successfully";
    }

    public String updateStudent(int id, String username, String useremail, String coursename) {
        StudentRegister studentregister = new StudentRegister(username, useremail, coursename);
        studentRepo.save(studentregister);
        return "Updated Successfully";
    }

    public String deleteStudent(int id) {
        studentRepo.deleteById(id);
        return "Deleted Successfully";
    }
}
