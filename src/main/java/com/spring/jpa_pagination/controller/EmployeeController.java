package com.spring.jpa_pagination.controller;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.jpa_pagination.model.entity.Employee;
import com.spring.jpa_pagination.service.EmployeeService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("employee")
@AllArgsConstructor
public class EmployeeController {


    private final EmployeeService employeeService;

    @GetMapping("/all")
    public String findEmployee(Model model){
      return findEmployeeByPage(model, 1);
    }
    @GetMapping("/page/{pageNumber}")
    public String findEmployeeByPage(Model model,@PathVariable("pageNumber") int pageNumber){
       Page<Employee> page = employeeService.findByPage(pageNumber);
       model.addAttribute("employees",page.getContent());
       model.addAttribute("totalPages",page.getTotalPages());
       model.addAttribute("totalItems",page.getTotalElements());
       model.addAttribute("currentPage",pageNumber);
        return "home";
    }
}
