package com.autocodegen.testspring.entity;

import javax.persistence.*;
import java.util.Date;

//https://github.com/2developer/employee-management
@Entity
@Table(name = "mt_employeescores")
public class EmployeeScoreEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_score_id")
    private long id;
    
    @Column(name = "emp_id")
    private long emp_id;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "dateScored")
    private Date dateScored;
    
    @Column(name = "address")
    private String address;
    

    public EmployeeScoreEntity(){

    }

    public EmployeeScoreEntity(long id, long emp_id, String gender, Date dateScored, String address) {
        this.id = id;
        this.emp_id = emp_id;
        this.gender = gender;
        this.dateScored = dateScored;
        this.address = address;

    }
    

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getEmpId(){
        return emp_id;
    }

    public void setEmpId(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateScored(){
        return dateScored;
    }

    public void setDateScored(Date dateScored){
        this.dateScored = dateScored;
    }

    public String setAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
