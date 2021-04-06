package control;

public class whileEx2 {
    public static void main(String[] args) {
        int ans;
        int num=1;
        int time=1;

        while (num<10){
            while (time<10){
                ans = num * time;
                System.out.println(num + "*" + time + "=" + ans + "입니다");
                time++;
            }
            num++;
            time =1;
        }
    }
}
