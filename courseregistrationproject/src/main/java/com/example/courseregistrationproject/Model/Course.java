package com.example.courseregistrationproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    String courseName;
    String courseId;
    int coursedurationinweek;
    String Trainer;

    public Course(String courseName, String courseId, int coursedurationinweek, String trainer) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.coursedurationinweek = coursedurationinweek;
        Trainer = trainer;
    }

    public Course() {
    }
}