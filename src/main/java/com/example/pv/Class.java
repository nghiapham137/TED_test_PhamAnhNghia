package com.example.pv;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String classCode;
    private String className;
}
