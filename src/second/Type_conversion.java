package second;

public class Type_conversion {
    public static void main(String[] args) {
        byte bnum = 10;
        int num = bnum;

        System.out.println(num);

        long lNum = 10;
        float fnum = lNum;
        System.out.println(fnum);

        int inum = 1000;
        byte mnum = (byte) inum;
        System.out.println(inum);
        System.out.println(mnum);
    }
}
