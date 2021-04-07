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


}

