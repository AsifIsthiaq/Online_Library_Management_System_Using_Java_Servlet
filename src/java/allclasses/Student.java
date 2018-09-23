/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allclasses;

/**
 *
 * @author Asif
 */
public class Student {
    private String studentid;
    private String name;
    private String fatherName;
    private String department;
    private int year;
    private int semester;
    
    public Student(String studentid,String name,String fatherName,String department,int year,int semester){
        this.studentid=studentid;
        this.name=name;
        this.fatherName=fatherName;
        this.department=department;
        this.year=year;
        this.semester=semester;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    
}
