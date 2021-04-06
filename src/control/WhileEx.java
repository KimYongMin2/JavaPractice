package control;

public class WhileEx {
    public static void main(String[] args) {
        int num=1;
        int sum=0;
        /*
        while(num <= 10){
            sum = sum+num;
            num++;
        }
        System.out.println("1부터 10 까지의 합은"+sum+"입니다.");
         */

        do{
            sum = sum+num;
            num++;
        }while (num <=10);
        System.out.println("1부터 10 까지의 합은"+sum+"입니다.");
    }
}
