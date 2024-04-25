package org.example.week7_OOP;

import java.util.ArrayList;


/**
 * Not an object oriented program.
 */
public class ITECCourseManager {

    public static void main(String[] args) {

  // Creation of a course named "Microcomputer Systems Maintenance"
    ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);


        //Add some students.   TODO check that we have not exceeded the max number for the class
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        // Students that will be removed
        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha"); // Martha isn't enrolled

        // Information of course will be displayed
        maintenanceCourse.writeCourseInfo();

        // Creation of a course named "Data Communications"
        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        // Creation of course will be displayed
        datacomCourse.writeCourseInfo();

        // New creation of course named "Software Development Projects"
        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2983,24);

        // Quantity added to the "Software Development Projects"
        softwareDevelopmentProjects.addStudent("Gus");
        softwareDevelopmentProjects.addStudent("Harry");
        softwareDevelopmentProjects.addStudent("Izzy");
        softwareDevelopmentProjects.addStudent("Jake");

        // Will help identify the total number of students enrolled in the "Software Development Projects"
        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        System.out.println("The software class has " + totalEnrolled + " students");
        System.out.println("ITEC " + softwareDevelopmentProjects.code + " " + softwareDevelopmentProjects.name);

        // Shows the maximum number of students in the course of "Software Development Projects"
        softwareDevelopmentProjects.maxStudents = 30;
        softwareDevelopmentProjects.writeCourseInfo();

        // Creation of new course called "Made up course"
        ITECCourse smallCourse = new ITECCourse("Made up course ", 1234, 3);
                smallCourse.addStudent("Kirby");
                smallCourse.addStudent("Liam");
                smallCourse.addStudent("Miriam");
                smallCourse.removeStudent("Kirby");
                smallCourse.addStudent("Nita");

                // Displays information about "Made up course"
                smallCourse.writeCourseInfo();

    }

}

