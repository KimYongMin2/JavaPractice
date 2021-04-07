package practiceby;

import java.util.Scanner;

public class BrowserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Browser browser = new Browser();
        browser.setInternetA(sc);
        browser.setInternetB(sc);
        browser.showBrowserInfo();
    }
}
