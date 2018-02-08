/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;

/**
 *
 * @author sangh
 */
public class studentDirectory {
    private ArrayList<student> Student;

    public studentDirectory() {
        Student = new ArrayList<student>();
    }

    public ArrayList<student> getStudent() {
        return Student;
    }

    public void setStudent(ArrayList<student> Student) {
        this.Student = Student;
    }
    public student addStudent(){
        student a = new student();
        Student.add(a);
        return a;
    }
}
