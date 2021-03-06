package cooperation;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        money -= 1000;
    }

    public void takeSub(Subway subway){
        subway.take(1000);
        money -= 1000;
    }

    public void showInfo(){
        System.out.println(studentName + "의 남은 돈은 " + money + "입니다.");
    }
}
