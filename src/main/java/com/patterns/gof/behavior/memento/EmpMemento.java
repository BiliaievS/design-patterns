package com.patterns.gof.behavior.memento;

/**
 * @author Sergii Biliaiev
 * Created on 27/08/2019.
 */
public class EmpMemento {
    private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;

    public EmpMemento(int empId, String empName, String empPhoneNo, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    @Override
    public String toString() {
        return "Current state, EmpMemento{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empPhoneNo='" + empPhoneNo + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }
}
