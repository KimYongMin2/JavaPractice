package practice;

import java.util.Scanner;

public class Student {
    int studentID;
    int grade;
    String studentName;
    String address;
    String dep;

    public void setStudentName() {
        System.out.println("이름을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        studentName = String.valueOf(sc.nextLine());
    }

    public void setStudentID() {
        System.out.println("학번을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        studentID = Integer.valueOf(sc.nextLine());
    }

    public void setGrade() {
        System.out.println("학년을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        grade = Integer.valueOf(sc.nextLine());
    }

    public void setAddress() {
        System.out.println("주소를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        address = String.valueOf(sc.nextLine());
    }

    public void setDep() {
        System.out.println("학과를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        dep = String.valueOf(sc.nextLine());
    }

    public void showStudentInfo(){
        System.out.println("학과 : " + dep + "\n학번 : " + studentID);
        System.out.println("학년 : " + grade + "\n이름 : " +studentName);
        System.out.println("사는 곳 : " + address);
    }

    public static void main(String[] args) {
        Student student_01 = new Student();
        student_01.setDep();
        student_01.setStudentID();
        student_01.setGrade();
        student_01.setStudentName();
        student_01.setAddress();

        student_01.showStudentInfo();
    }
}
