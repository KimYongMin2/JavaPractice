package practiceby;

import java.util.Scanner;

public class Browser {
    String browserName;
    String browserVersion;
    Internet a;
    Internet b;

    public Browser(){
        System.out.println("브라우저 이름을 입력해주세요");
        Scanner bName = new Scanner(System.in);
        browserName = String.valueOf(bName.nextLine());
        System.out.println("버전을 입력해주세요");
        Scanner ver = new Scanner(System.in);
        browserVersion = String.valueOf(ver.nextLine());
        a = new Internet();
        b = new Internet();
    }

    public void setInternetA(){
        System.out.println("인터넷창 A의 이름을 입력해주세요");
        Scanner iName = new Scanner(System.in);
        String internetName = String.valueOf(iName.nextLine());
        a.setInternetName(internetName);
        System.out.println("인터넷창 A의 주소를 입력해주세요");
        Scanner address = new Scanner(System.in);
        String internetAddress = String.valueOf(address.nextLine());
        a.setIpAddress(internetAddress);
    }
    public void setInternetB(){
        System.out.println("인터넷창 B의 이름을 입력해주세요");
        Scanner iName = new Scanner(System.in);
        String internetName = String.valueOf(iName.nextLine());
        b.setInternetName(internetName);
        System.out.println("인터넷창 B의 주소를 입력해주세요");
        Scanner address = new Scanner(System.in);
        String internetAddress = String.valueOf(address.nextLine());
        b.setIpAddress(internetAddress);
    }

    public void showBrowserInfo(){
        System.out.println("브라우저 이름 : " + browserName + " 버전 : " + browserVersion + "입니다");
        System.out.println("인터넷 창 A의 이름 :" + a.getInternetName() + " 아이피 주소 : " + a.getIpAddress());
        System.out.println("인터넷 창 B의 이름 :" + b.getInternetName() + " 아이피 주소 : " + b.getIpAddress());
    }
}

