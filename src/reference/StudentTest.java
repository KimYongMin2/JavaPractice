package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student(100, "Kim");
        studentKim.setKorea("국어",100);
        studentKim.setMath("수학",100);

        Student studentLee = new Student(100, "Lee");
        studentLee.setKorea("국어",80);
        studentLee.setMath("수학",60);

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();
    }

}
