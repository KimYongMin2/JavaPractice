package practice;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        int studentGrade;
        int studentBirth;
        String studentName;
        String studentAddress;
        String studentDep;

        Student student = new Student();

        System.out.println("이름을 입력해주세요");
        Scanner name = new Scanner(System.in);
        studentName = String.valueOf(name.nextLine());

        System.out.println("생년월일을 입력해주세요");
        Scanner birth = new Scanner(System.in);
        studentBirth = Integer.valueOf(birth.nextLine());

        System.out.println("주소를 입력해주세요");
        Scanner address = new Scanner(System.in);
        studentAddress = String.valueOf(address.nextLine());

        System.out.println("학과를 입력해주세요");
        Scanner dep = new Scanner(System.in);
        studentDep = String.valueOf(dep.nextLine());

        System.out.println("학년를 입력해주세요");
        Scanner grade = new Scanner(System.in);
        studentGrade = Integer.valueOf(grade.nextLine());

        student.setDep(studentDep);
        student.setBirth(studentBirth);
        student.setGrade(studentGrade);
        student.setStudentName(studentName);
        student.setAddress(studentAddress);
        student.setStudentID();

        student.showStudentInfo();
    }
}
