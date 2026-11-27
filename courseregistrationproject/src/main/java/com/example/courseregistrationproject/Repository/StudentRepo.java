package com.example.courseregistrationproject.Repository;

import com.example.courseregistrationproject.Model.StudentRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentRegister, Integer> {

}
