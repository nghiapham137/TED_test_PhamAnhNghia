package com.example.pv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("students")
public class controller {
    @Autowired
    private IService service;

    @GetMapping
    public String findAllStudent(Model model) {
        Iterable<Student> students = service.findAll();
        model.addAttribute("students", students);
        return "students";
    }
}
