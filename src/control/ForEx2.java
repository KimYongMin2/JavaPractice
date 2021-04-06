package control;

public class ForEx2 {
    public static void main(String[] args) {
        int ans =0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                ans = i*j;
                System.out.println(i + "*" + j + "=" + ans);
            }
            System.out.println("");
        }
    }
}
