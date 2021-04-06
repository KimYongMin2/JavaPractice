package control;

public class ForEx {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        for (int i = num; i < 11; i++) {
            sum += i;
        }
        System.out.println(num + "부터 10 까지의 합은" + sum + "입니다.");
    }
}
