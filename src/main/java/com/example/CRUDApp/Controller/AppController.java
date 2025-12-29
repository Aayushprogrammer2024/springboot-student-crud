package com.example.CRUDApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.CRUDApp.Entity.student;
import com.example.CRUDApp.Service.StudentService;





@Controller
public class AppController {
    @Autowired
    StudentService studentservice;
    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("student", studentservice.showAll());
        return "show";
    }
    

    @GetMapping("/insert")
    public String insert(Model model) {
        model.addAttribute("student",new student());
        return "insert";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute student st) {
        studentservice.insert(st);
        return "redirect:/";

    }

    @GetMapping("/delete/{rollno}")
    public String delete(@PathVariable int rollno) {
        studentservice.delete(rollno);
        return "redirect:/";
    }

    @GetMapping("/update/{rollno}")
 public ModelAndView update(@PathVariable int rollno)
 {
    ModelAndView mv=new ModelAndView("insert");
    student st=studentservice.get(rollno);
    mv.addObject("student",st);
    return mv;
 }
    
    

    
}
