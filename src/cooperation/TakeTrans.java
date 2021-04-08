package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student jang = new Student("Jang", 5000);
        Student kim = new Student("Kim", 4000);

        Bus bus100 = new Bus(100);
        Subway sub3 = new Subway(3);

        jang.takeBus(bus100);
        kim.takeSub(sub3);

        jang.showInfo();
        kim.showInfo();
        bus100.showInfo();
        sub3.showInfo();
    }
}
