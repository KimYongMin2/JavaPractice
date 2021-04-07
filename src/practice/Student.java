package practice;

import java.util.Scanner;

public class Student {
    int studentID;
    int grade;
    int birth;
    String studentName;
    String address;
    String dep;

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void setBirth(int birth) {
        this.birth =birth;
    }

    public void setStudentID() {
        studentID = birth+21000000;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setDep(String dep){
        this.dep = dep;
    }


    public void showStudentInfo(){
        System.out.println("학과 : " + dep + "\n학번 : " + studentID);
        System.out.println("학년 : " + grade + "\n이름 : " +studentName);
        System.out.println("사는 곳 : " + address);
    }

}
