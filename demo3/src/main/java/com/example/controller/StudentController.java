package com.example.controller;

import com.example.dao.StudentRepository;
import com.example.pojo.Student;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/findAll")
    public String findAll(@RequestParam(value="pageNum",defaultValue = "1",required = true) Integer pageNum, Model model){
        List<Sort.Order> orders =new ArrayList<>();
        orders.add(Sort.Order.desc("age"));
        orders.add(Sort.Order.desc("id"));
        Pageable pageable =PageRequest.of(pageNum,5,Sort.by(orders));
        Page<Student> students =studentRepository.findAll(pageable);


        List<Student> content = students.getContent();
        int totalPages = students.getTotalPages();
        model.addAttribute("content",content);
        model.addAttribute("totalPages",totalPages);

        return "student";

    }
}
