package practiceby;

public class Browser2 {
    String browserName;
    String browserVersion;
    Internet2 a;
    Internet2 b;

    public Browser2(String bName, String version){
        this.browserName = bName;
        this.browserVersion = version;
        a = new Internet2();
        b = new Internet2();
    }

    public void setInternetA(String iName, String ipAddress){
        a.setInternetName(iName);
        a.setInternetIp(ipAddress);
    }

    public void setInternetB(String iName, String ipAddress){
        b.setInternetName(iName);
        b.setInternetIp(ipAddress);
    }

    public void showBrowserInfo(){
        System.out.println("브라우저 이름 : " + browserName + " 버전 : " + browserVersion + "입니다");
        System.out.println("인터넷 창 A의 이름 :" + a.getInternetName() + " 아이피 주소 : " + a.getInternetIp());
        System.out.println("인터넷 창 B의 이름 :" + b.getInternetName() + " 아이피 주소 : " + b.getInternetIp());

    }
}
