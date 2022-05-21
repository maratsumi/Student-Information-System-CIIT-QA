/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.information.system;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author maraa
 */
public class Student {
    
    private String firstName;
    private String middleName;
    private String lastName;
    
    private Date birthDate;
    private String address;
            
    private String contactNum;
    private String emailAddress;
    
    private String password;
    
    private int gradeLevel;
    private String section;
    private LinkedList<Subjects> subjectsEnrolled = new LinkedList<Subjects>();
    private int studentId;
    
    
    public Student(){
        this.lastName = "Bata";
        this.firstName = "Annie";
        this.middleName = "Randy";
        this.birthDate = new Date (1990, 1, 1);
        this.address = "123 Emerald Street, Pasig City";
        this.contactNum = "09222222222";
        this.emailAddress = "sample@domain.com";
        this.password = "1234";
        this.studentId = 0;
    }
    
    public Student(String lastName, String firstName, String middleName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = new Date (1990, 1, 1);
        this.address = "123 Emerald Street, Pasig City";
        this.contactNum = "09222222222";
        this.emailAddress = "sample@domain.com";
        this.password = "1234";
        this.studentId = 0;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public LinkedList<Subjects> getSubjectsEnrolled() {
        return subjectsEnrolled;
    }

    public void setSubjectsEnrolled(LinkedList<Subjects> subjectsEnrolled) {
        this.subjectsEnrolled = subjectsEnrolled;
    }
    
    public void addSubject (Subjects subject){
        this.subjectsEnrolled.add(subject);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public void debugInfo() {
        System.out.println("Full name: " + this.lastName + " " + this.firstName + " " + this.middleName);
        System.out.println("Birth date: " + this.birthDate);
        System.out.println("Address: " + this.address);
        System.out.println("Contact Number: " + this.contactNum);
        System.out.println("Email Address: " + this.emailAddress);
    }
}
