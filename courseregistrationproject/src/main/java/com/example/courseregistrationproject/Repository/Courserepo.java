package com.example.courseregistrationproject.Repository;

import com.example.courseregistrationproject.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepo extends JpaRepository<Course,String> {
}
