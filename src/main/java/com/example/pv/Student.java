package com.example.pv;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String StudentCode;
    private String fullName;
    private Date dob;
    @ManyToOne
    private Class aClass;


}
