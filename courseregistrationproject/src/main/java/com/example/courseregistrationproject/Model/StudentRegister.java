package com.example.courseregistrationproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String username;
    String useremail;
    String coursename;

    public StudentRegister(int id, String username, String useremail, String coursename) {
        this.id = id;
        this.username = username;
        this.useremail = useremail;
        this.coursename = coursename;
    }

    public StudentRegister(String username, String useremail, String coursename) {
        this.username = username;
        this.useremail = useremail;
        this.coursename = coursename;
    }

    public StudentRegister() {

    }
}

