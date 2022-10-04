/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author elias
 */

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String studentname;
    private String course;
    private int fee;

  public  Student(){}
    
  public  Student(Long id,String studentname,String course, int fee){
    
        super();
    this.id=id;
    this.studentname=studentname;
    this.course=course;
    this.fee=fee;
   
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the studentname
     */
    public String getStudentname() {
        return studentname;
    }

    /**
     * @param studentname the studentname to set
     */
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the fee
     */
    public int getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(int fee) {
        this.fee = fee;
    }
    

}
