package practiceby;
    import java.util.Scanner;

    public class BrowserTestEx {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            String browserName = inputWithMessage("브라우저 이름을 입력해주세요");
            String browserVersion = inputWithMessage("버전을 입력해주세요");
            BrowserEx browser = new BrowserEx(browserName, browserVersion);
            String internetAName = inputWithMessage("인터넷창 A의 이름을 입력해주세요");
            String internetAAddress = inputWithMessage("인터넷창 A의 주소를 입력해주세요");
            browser.setInternetA(internetAName,internetAAddress);
            String internetBName = inputWithMessage("인터넷창 B의 이름을 입력해주세요");
            String internetBAddress = inputWithMessage("인터넷창 B의 주소를 입력해주세요");
            browser.setInternetB(internetBName,internetBAddress);
            browser.showBrowserInfo();
        }

        public static String inputWithMessage(String message) {
            System.out.print(message + " : ");
            return sc.nextLine();
        }
    }
