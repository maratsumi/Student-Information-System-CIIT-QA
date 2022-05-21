/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.information.system;

import java.time.LocalTime;

/**
 *
 * @author maraa
 */
public class Subjects {
    
    private String subjectCode;
    private String name;
    private String teacher;
    private LocalTime start, end;
    private int subjectId;

    public Subjects() {
        this.subjectCode = "ABC123";
        this.name = "Default Subject";
        this.teacher = "Default Teacher";
        this.start = LocalTime.of(9, 0);
        this.end = LocalTime.of(10, 0);
        this.subjectId = 0;
    }

    public Subjects(String subjectCode, String name, String teacher) {
        this.subjectCode = subjectCode;
        this.name = name;
        this.teacher = teacher;
        this.start = LocalTime.of(9, 0);
        this.end = LocalTime.of(10, 0);
        this.subjectId = 0;
    }

    public Subjects(String subjectCode, String name, String teacher, LocalTime start, LocalTime end) {
        this.subjectCode = subjectCode;
        this.name = name;
        this.teacher = teacher;
        this.start = start;
        this.end = end;
        this.subjectId = 0;
    }
    
    public void DisplayInformation(){
        System.out.println("Subject Code: " + this.subjectCode);
        System.out.println("Subject Name: " + this.name);
        System.out.println("Subject Teacher: " + this.teacher);
        System.out.println("Subject Code: " + this.subjectCode);
        System.out.println("Subject Starts at: " + this.start);
        System.out.println("Subject Ends at: " + this.end);
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
    
    
}
