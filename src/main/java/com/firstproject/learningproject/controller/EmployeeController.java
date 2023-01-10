package com.firstproject.learningproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//restcontroller= controller + responsebody
public class EmployeeController {

    @GetMapping("/employees")
    public String getEmployees(){
        return " show the list of employees ";
    }

    @GetMapping("/employee/{id}")
    public String getidemployee(@PathVariable("id") Integer id){
        return "here is the id " +id;

    }

    @DeleteMapping("/employee")
    public String deleteEmployee(@RequestParam Long id){
        return "delete employee with id "+id;
    }

}
