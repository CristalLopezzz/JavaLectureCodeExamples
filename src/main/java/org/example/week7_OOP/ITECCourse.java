package org.example.week7_OOP;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // Data that will be useful among the program
    String name; // This will provide the name of course
    int code; // Will provide code of the course using int
    List<String> students; // List of students enrolled in courses in string format
    int maxStudents; // Will provide maximum of students in int format

    // Constructor that will help initiate the data involved within the course
    ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>(); // Data will be added to a new array list
    }

    // This is a method that will add a student to the course
    void addStudent(String studentName) {
        // If loop will help identify if the course is full or not
        if (students.size() == maxStudents) {
            // If it is full it will print the following message
            System.out.println("Course is full, can't add " + studentName);
        } else { // If it is not full it will add the studentName to the course
            students.add(studentName);
        }
        students.add(studentName);
    }

    // Method that will help display information involving the course
    void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        // Goes through each name in list and prints it
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is  " + maxStudents);
    }

    // Method that will return the total number of students in course
    int getNumberOfStudents() {
        return students.size();
    }

    // Method that will help remove a student from a course
    void removeStudent(String studentName) {
        // If loop will help identify if the students name is enrolled in the course
        if (students.contains(studentName)) {
            // If it is in the list it will remove the student and print the following message
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + name);
        } else { // If the name is not found it will print the following message
            System.out.println(studentName + " was not found in " + name);
        }
    }
}
