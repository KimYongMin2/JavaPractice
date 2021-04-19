package ArrayEx;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectArrayList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectArrayList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjectArrayList.add(subject);
    }
}
