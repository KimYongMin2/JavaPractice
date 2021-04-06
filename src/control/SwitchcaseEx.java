package control;

public class SwitchcaseEx {
    public static void main(String[] args) {
        int rank = 1;
        char medalColor;

        /*
        if (rank == 1) {
            medalColor = 'G';
        }
        else if (rank == 2) {
            medalColor = 'S';
        }
        else if (rank == 3) {
            medalColor = 'B';
        }
        else {
            medalColor = 'A';
        }
        System.out.println("등수에 맞는 메달 색은" + medalColor + "입니다.");
        */

        switch (rank) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                medalColor = 'A';
        }
        System.out.println("등수에 맞는 메달 색은" + medalColor + "입니다.");

    }
}
