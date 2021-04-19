package practice;


import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ddeng=0;

        Student student[] = new Student[5];
        Student student1 = new Student();
        student1.setStudentInfo(0, "김용민", 1,"전자과", "서울"
                , "010");
        student[0].setStudentInfo(0, "김용민", 1,"전자과", "서울"
        , "010");
          /*  do {
                System.out.print("이름 입력해주세요 : ");
                String name = sc.nextLine();
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
               student[0].setStudentInfo(id, name, grade, dep, address, tel);
               ddeng = student[0].studentInfoCheck();
            } while (ddeng == 0);


        for (int i = 0; i < 5; i++) {
            student[i].showStudentInfo();
        }

           */
        student[0].showStudentInfo();
    }


}
