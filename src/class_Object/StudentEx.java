package class_Object;

public class StudentEx {
    public static void main(String[] args) {
        Student student_01 = new Student();
        student_01.studentId = 100101;
        student_01.studentName = "김용민";
        student_01.grade = 3;
        student_01.address = "서울";
        student_01.showStudentInfo();
    }
}
