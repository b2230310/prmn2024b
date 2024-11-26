package lecture2;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("数字%dつ目", i+1);
            num[i] = scan.nextInt();
            System.out.println("");
        }
        Keisan keisan = new Keisan();
        int sum = keisan.goukei(num);
        keisan.hanbetu(sum);

    }

}

