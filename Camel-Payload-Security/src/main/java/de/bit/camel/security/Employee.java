package de.bit.camel.security;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Rami TORKHANI
 */
@XmlRootElement
public class Employee {
    private String empId = "";
    private String name = "";
    private String jobTitle = "";
    private String department = "";



    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }




    @Override
    public String toString() {
        StringBuilder emp = new StringBuilder();
        emp.append("empId ").append(empId).append(", ");
        emp.append("name ").append(name).append(", ");
        emp.append("jobTitle ").append(jobTitle).append(", ");
        emp.append("department ").append(department);

        return emp.toString();
    }
}
