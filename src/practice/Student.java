package practice;

public class Student {
    String studentName;
    StudentInfo studentInfo;

    public Student(String name){
        this.studentName = name;
        studentInfo = new StudentInfo();
    }

    public void setStudentInfo(int studentId, String studentName, int studentGrade,
                               String studentDep, String studentAddress, String studentTel){
        studentInfo.setStudentName(studentName);
        studentInfo.setStudentDep(studentDep);
        studentInfo.setStudentId(studentId);
        studentInfo.setStudentGrade(studentGrade);
        studentInfo.setStudentTel(studentTel);
        studentInfo.setStudentAddress(studentAddress);
    }

    public void showStudentInfo(){
        System.out.println("학과 : " + studentInfo.getStudentDep() + " 학번 : " + studentInfo.getStudentId());
        System.out.println("학년 : " + studentInfo.getStudentGrade() + " 이름 : " + studentInfo.getStudentName());
        System.out.println("전화번호 : " + studentInfo.getStudentTel());
        System.out.println("주소 : " + studentInfo.getStudentAddress());
    }

    public int studentInfoCheck(){
        if (studentInfo.ddeng == true){
            System.out.println("정상입력되었습니다.");
            System.out.println("");
            return 1;
        }
        else{
            System.out.println("정상입력되지않았습니다.");
            System.out.println("");
            return 0;
        }
    }


}
