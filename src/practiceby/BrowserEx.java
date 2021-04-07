package practiceby;

    public class BrowserEx {
        String browserName;
        String browserVersion;
        Internet a;
        Internet b;

        public BrowserEx(String browserName, String browserVersion){
            this.browserName = browserName;
            this.browserVersion = browserVersion;
            a = new Internet();
            b = new Internet();
        }

        public void setInternetA(String internetAName, String internetAAddress){
            a.setInternetName(internetAName);
            a.setIpAddress(internetAAddress);
        }
        public void setInternetB(String internetBName, String internetBAddress){
            b.setInternetName(internetBName);
            b.setIpAddress(internetBAddress);
        }

        public void showBrowserInfo(){
            System.out.println("브라우저 이름 : " + browserName + " 버전 : " + browserVersion + "입니다");
            System.out.println("인터넷 창 A의 이름 :" + a.getInternetName() + " 아이피 주소 : " + a.getIpAddress());
            System.out.println("인터넷 창 B의 이름 :" + b.getInternetName() + " 아이피 주소 : " + b.getIpAddress());
        }
    }
