package com.autocodegen.testspring.dto.request;

import java.io.Serializable;
import java.util.Date;

public class EmployeeScoreRequest implements Serializable {
    private long emp_id;
    private String gender;
    private Date dateScored;
    private String address;

    public long getEmpId() {
        return emp_id;
    }

    public void setEmpId(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateScored() {
        return dateScored;
    }

    public void setDateScored(Date dateScored) {
        this.dateScored = dateScored;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
