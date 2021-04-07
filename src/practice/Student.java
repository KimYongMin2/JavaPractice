package practice;


import java.util.Scanner;

public class Student {
    String studentName;
    int studentBirth;
    StudentInfo studentInfo;


    public Student(String name, int birth){
        studentName = name;
        studentBirth = birth;
        studentInfo = new StudentInfo();
    }

    public void setStudentInfo(){
        studentInfo.setStudentName(studentName);
        studentInfo.setBirth(studentBirth);

        System.out.println("주소를 입력해주세요");
        Scanner address = new Scanner(System.in);
        String studentAddress = String.valueOf(address.nextLine());
        studentInfo.setAddress(studentAddress);

        System.out.println("학과를 입력해주세요");
        Scanner dep = new Scanner(System.in);
        String studentDep = String.valueOf(dep.nextLine());
        studentInfo.setDep(studentDep);

        System.out.println("학년를 입력해주세요");
        Scanner grade = new Scanner(System.in);
        int studentGrade = Integer.valueOf(grade.nextLine());
        studentInfo.setGrade(studentGrade);

        studentInfo.setStudentID();
    }

    public void showStudentInfo(){
        System.out.println("학과 : " + studentInfo.getDep() + "\n학번 : " + studentInfo.getStudentID());
        System.out.println("학년 : " + studentInfo.getGrade() + "\n이름 : " +studentInfo.getStudentName());
        System.out.println("사는 곳 : " + studentInfo.getAddress());
    }

}
