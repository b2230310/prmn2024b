package lecture2;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        String number = "B2001000";

        Scanner scan= new Scanner(System.in);
        System.out.print("学籍番号を入力してください: ");
        String gakusekinumber = scan.nextLine();

        Gakuseki gakuseki = new Gakuseki();
        gakuseki.Hantei(number,gakusekinumber);


    }
}
