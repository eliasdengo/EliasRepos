/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

/**
 *
 * @author elias
 */

@Service
public class studentService {
    @Autowired
    private StudentRepository repo;
    
    public  List<Student> listAll(){
    return repo.findAll();
    }
    
    public void save(Student std){
    
        repo.save(std);
    }
    public Student get(long id){
    return repo.findById(id).get();
    }
    
    public void delete(long id){
    
        repo.deleteById(id);
    }
}
