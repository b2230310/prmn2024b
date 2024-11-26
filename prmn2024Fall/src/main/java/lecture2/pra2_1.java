package lecture2;

import java.util.Scanner;

public class pra2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("氏名を入力してください: ");
        String name = scan.nextLine();
        System.out.print("学籍番号を入力してください: ");
        String number = scan.nextLine();

        System.out.printf("氏名 :%s, 学籍番号 :%s", name  , number);

    }
}
