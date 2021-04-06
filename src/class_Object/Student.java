package class_Object;

public class Student {

    int studentId;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo(){
        System.out.println("학번 : " + studentId + "\n학년 : " + grade + "\n이름 : " +studentName);
        System.out.println("사는 곳 : " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args) {
        Student student_01 = new Student();
        student_01.studentId = 100101;
        student_01.studentName = "김용민";
        student_01.grade = 3;
        student_01.address = "서울";
        student_01.showStudentInfo();
    }
}

