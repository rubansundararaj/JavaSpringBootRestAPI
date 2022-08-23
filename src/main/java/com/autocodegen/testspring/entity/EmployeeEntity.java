package com.autocodegen.testspring.entity;

import javax.persistence.*;
import java.util.Date;

//https://github.com/2developer/employee-management
@Entity
@Table(name = "mt_employee")
public class EmployeeEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;
    
    @Column(name = "address")
    private String address;
    

    public EmployeeEntity(){

    }

    public EmployeeEntity(long id, String name, String gender, Date dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;

    }
    

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String setAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
