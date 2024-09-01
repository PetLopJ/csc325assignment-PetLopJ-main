package main.java.org.example;

import org.example.Student;

import java.util.Scanner;

public class StudentLst {

    public static void main(String[] args) {
        Student[] students= new Student[2];
        Scanner inScanner = new Scanner(System.in);

        for(int i=0; i< students.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student();
            student.setName(name);
            students[i]= student;

        }
        System.out.println(printOutput(students));
    }

    public static String printOutput(Student[] students){
        StringBuilder str = new StringBuilder();

        //To Do 03: complete the implementation of this method

        for(int i = 0; i < students.length; i++)
        {
           str.append(students[i].getName()).append("\n");
        }
        return str.toString();
    }
}