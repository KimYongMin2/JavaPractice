package practice;


import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ddeng=0;

        Student student = new Student("김용민");
        do {
            System.out.print("학번을 입력해주세요 : ");
            int id = Integer.valueOf(sc.nextLine());
            System.out.print("학년을 입력해주세요 : ");
            int grade = Integer.valueOf(sc.nextLine());
            System.out.print("학과를 입력해주세요 : ");
            String dep = sc.nextLine();
            System.out.print("주소를 입력해주세요 : ");
            String address = sc.nextLine();
            System.out.print("전화번호를 입력해주세요 : ");
            String tel = sc.nextLine();
            student.setStudentInfo(id, student.studentName, grade, dep, address, tel);
            ddeng = student.studentInfoCheck();

        } while (ddeng == 0);

        student.showStudentInfo();
    }

}
