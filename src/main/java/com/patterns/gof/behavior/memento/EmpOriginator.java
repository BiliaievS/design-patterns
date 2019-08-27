package com.patterns.gof.behavior.memento;

/**
 * @author Sergii Biliaiev
 * Created on 27/08/2019.
 */
public class EmpOriginator {
    private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;

    public EmpOriginator(int empId, String empName, String empPhoneNo, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public EmpMemento saveToMemento() {
        return new EmpMemento(this.empId, empName, empPhoneNo, empDesignation);
    }

    public void undo(EmpMemento memento) {
        empId = memento.getEmpId();
        empName = memento.getEmpName();
        empPhoneNo = memento.getEmpPhoneNo();
        empDesignation = memento.getEmpDesignation();
    }

    public void printInfo() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Phone No:" + empPhoneNo);
        System.out.println("Description: " + empDesignation);
    }
}
