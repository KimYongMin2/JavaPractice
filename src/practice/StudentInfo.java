package practice;

public class StudentInfo {
    String studentName;
    int studentId;
    String studentDep;
    int depCode;
    int studentGrade;
    String studentAddress;
    String studentTel;
    static int totalNum=1;
    boolean ddeng = false;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
        if (studentId==0) {
            this.studentId = 2021000000 + (this.depCode * 1000) + totalNum;
        }
    }

    public String getStudentDep() {
        return studentDep;
    }

    public void setStudentDep(String studentDep) {
        switch (studentDep){
            case "전자과" :
                depCode = 124;
                break;
            case "수학과" :
                depCode = 126;
                break;
            default:
                depCode = 000;
                ddeng = false;
        }
        this.studentDep = studentDep;

    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
        if ((2021000000 + (this.depCode * 1000) + totalNum - studentId)==studentGrade-1){
            ddeng = true;
        }
        else{
            ddeng = false;
        }
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentTel() {
        return studentTel;
    }

    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel;
    }
}
