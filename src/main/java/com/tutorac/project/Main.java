package com.tutorac.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utils utils = new Utils();
        College college = new College();
        List<Student> students = new ArrayList<>();
        List<Subject> subjects = new ArrayList<>();
        int option;
        boolean isRunning = true;
        System.out.println("####### WELCOME TO STUDENT MANAGEMENT SYSTEM #######");
        while(isRunning) {
            System.out.println("Choose an option from below menu : ");
            System.out.println("1. Create a college");
            System.out.println("2. Create a Student");
            System.out.println("3. Read Student Data");
            System.out.println("4. Update Student Data");
            System.out.println("5. Delete Student Data");
            System.out.println("6. Assign Student to College");
            System.out.println("7. Quit Program");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    college = utils.createCollege();
                    System.out.println("College Created!");
                    break;

                case 2:
                    students.add(utils.createStudent());
                    break;

                case 3:
                    Student st = utils.readStudentDetails(students);
                    if(st != null) {
                        System.out.println("Student Details : ");
                        System.out.println("id : "+st.getId());
                        System.out.println("Name : "+st.getName());
                        System.out.println("Emaili : "+st.getEmail());
                        System.out.println("Phone : "+st.getPhone());
                        System.out.println("Age : "+st.getAge());
                    }else {
                        System.out.println("Student doesn't exist! Please check input");
                    }
                    break;

                case 4:
                    Student stu = utils.updateStudentDetails(students);
                    if(stu != null) {
                        int index = students.indexOf(stu);
                        students.remove(index);
                        students.add(stu);
                    }
                    break;

                case 5:
                    System.out.println("DELETE STUDENT LOGIC");
                    break;

                case 6:
                    System.out.println("Enter Student id to add to college : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Student st3 = utils.studentExists(students, id);
                    if(st3 != null) {
                        college.getStudents().add(st3);
                    }else {
                        System.out.println("Student Doesn't exist. Please check Input");
                    }
                    break;

                case 7:
                    System.out.println("Bye!!");
                    isRunning = false;
            }
        }
    }
}
