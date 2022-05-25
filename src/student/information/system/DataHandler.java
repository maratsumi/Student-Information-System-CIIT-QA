/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.information.system;

import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;


/**
 *
 * @author maraa
 */
public class DataHandler {
    
    public static class Administrator {
        public static Admin sampleAdmin;
        
        public static void createAdmin(){
            sampleAdmin = new Admin("First Name", "Last Name", "Middle Name", "admin", "admin123");
        }
    }
    
    public static class Students {
        public static LinkedList<Subjects> availableSubjects = new LinkedList<Subjects>();
        public static LinkedList<Student> registeredStudents = new LinkedList<Student>();
        public static Student sampleStudent;
        public static Subjects sampleSubject;
                
        public static void createStudent(String lastName, String firstName, String middleName, Date birthDate,
                                        String address, String contactNum, String email, int grade, String section, String password){
            sampleStudent = new Student(lastName, firstName, middleName);
            sampleStudent.setBirthDate(birthDate);
            sampleStudent.setAddress(address);
            sampleStudent.setContactNum(contactNum);
            sampleStudent.setEmailAddress(email);
            sampleStudent.setGradeLevel(grade);
            sampleStudent.setSection(section);
            sampleStudent.setPassword(password);
            
            Subjects tempSubject = new Subjects("SHS-SSP-02", "Computer Programming 1", "Sir Romello Gordon Martin", LocalTime.of(13, 0), LocalTime.of(16, 0));
            sampleStudent.addSubject(tempSubject);

            registeredStudents.addLast(sampleStudent);
            sampleStudent.setStudentId(registeredStudents.indexOf(sampleStudent));
        }
        
        public static void CreateSubjects(String courseCode, String courseName, String teacherName, LocalTime start, LocalTime end){
            
            sampleSubject = new Subjects(courseCode, courseName, teacherName, start, end);
            availableSubjects.addLast(sampleSubject);
            sampleSubject.setSubjectId(availableSubjects.indexOf(sampleSubject));
        }
    }
    
}
