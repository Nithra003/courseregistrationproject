package com.example.courseregistrationproject.Controller;


import com.example.courseregistrationproject.Model.Course;
import com.example.courseregistrationproject.Model.StudentRegister;
import com.example.courseregistrationproject.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getCourseList(){
        return courseService.getcourselist();
    }
    @GetMapping("/students")
    public List<StudentRegister> getStudentList(){
        return courseService.getstudentregisterlist();
    }
    @PostMapping("/register/")
    public String addStudent(@RequestParam("username") String username,
                             @RequestParam("useremail") String useremail,
                             @RequestParam("coursename") String coursename){
        return courseService.addStudent(username,useremail,coursename);
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id,
                                @RequestParam("username") String username,
                                @RequestParam("useremail") String useremail,
                                @RequestParam("coursename") String coursename) {
        return courseService.updateStudent(id, username, useremail, coursename);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return courseService.deleteStudent(id);
    }



}
