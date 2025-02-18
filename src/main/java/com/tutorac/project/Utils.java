package com.tutorac.project;

import java.util.List;
import java.util.Scanner;

public class Utils {

    Scanner sc = new Scanner(System.in);

    public Student createStudent() {
        Student st = new Student();
        System.out.println("Enter Student id : ");
        int id = sc.nextInt();
        sc.nextLine();
        st.setId(id);
        System.out.println("Enter Student name : ");
        String name = sc.nextLine();
        st.setName(name);
        System.out.println("Enter Student email : ");
        String email = sc.nextLine();
        st.setEmail(email);
        System.out.println("Enter Student phone : ");
        String phone = sc.nextLine();
        st.setPhone(phone);
        System.out.println("Enter Student age : ");
        int age = sc.nextInt();
        sc.nextLine();
        st.setAge(age);
        return st;
    }

    public Student readStudentDetails(List<Student> students) {
        System.out.println("Enter Student id : ");
        int id = sc.nextInt();
        sc.nextLine();
        return studentExists(students, id);
    }

    public Student studentExists(List<Student> students, int id) {
        for(Student st : students) {
            if(st.getId() == id) {
                return st;
            }
        }
        return null;
    }

    public Student updateStudentDetails(List<Student> students) {
        System.out.println("Enter Student id  : ");
        int id = sc.nextInt();
        sc.nextLine();
        Student st = studentExists(students, id);
        if(st != null) {
            System.out.println("Enter Updated phone Number : ");
            String phone = sc.nextLine();
            st.setPhone(phone);
            System.out.println("Enter Email : ");
            String email = sc.nextLine();
            st.setEmail(email);
            return st;
        }else {
            return null;
        }
    }

    public College createCollege() {
        College c = new College();
        System.out.println("Enter college id : ");
        int id = sc.nextInt();
        sc.nextLine();
        c.setId(id);
        System.out.println("Enter college name : ");
        String name = sc.nextLine();
        c.setName(name);
        System.out.println("Enter college location : ");
        String location = sc.nextLine();
        c.setLocated(location);
        return c;
    }
}
