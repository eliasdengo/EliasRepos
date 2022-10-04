/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.studentService;

/**
 *
 * @author elias
 */
@Controller
public class StudentController {
    @Autowired
    private studentService service;
    
    @GetMapping("/")
    public String viewHomePage(Model model){
        List<Student> liststudent=service.listAll();
        model.addAttribute("liststudent", liststudent);
        System.out.print("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("student",new Student());
        return "new";
    }
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student")Student std){
    
        service.save(std);
        return "redirect:/";
    
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView  showEditStudentPage(@PathVariable(name="id")int id){
      ModelAndView mv=new ModelAndView("new");
      Student std=service.get(id);
      mv.addObject("student", std);
        return mv;
    }
    @RequestMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(name="id")int id){
        service.delete(id);
    return "redirect:/";
    }
}
