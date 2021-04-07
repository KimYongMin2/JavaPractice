package practiceby;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("브라우저 이름을 입력해주세요 : ");
        String bName = sc.nextLine();
        System.out.print("브라우저 버전을 입력해주세요 : ");
        String bVersion = sc.nextLine();
        Browser2 browser = new Browser2(bName, bVersion);
        System.out.print("인터넷창 A의 이름을 입력해주세요 : ");
        String aIName = sc.nextLine();
        System.out.print("인터넷 창 A의 IpAddress를 입력해주세요 : ");
        String aIAdd = sc.nextLine();
        browser.setInternetA(aIName, aIAdd);
        System.out.print("인터넷창 B의 이름을 입력해주세요 : ");
        String bIName = sc.nextLine();
        System.out.print("인터넷 창 B의 IpAddress를 입력해주세요 : ");
        String bIAdd = sc.nextLine();
        browser.setInternetB(bIName, bIAdd);
        browser.showBrowserInfo();
    }
}
