package lecture2;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        String[][] accountInfo ={
                {"B2201000","a1"},
                {"B2202000","a2"},
                {"B2203000","a3"},
                {"B2204000","a4"},
                {"B2205000","a5"},
        };

        Scanner scan = new Scanner(System.in);

        System.out.print("学籍番号を入力してください: ");
        String studentID = scan.nextLine();

        Account account = new Account();

        int index = account.checkStudentID(studentID,accountInfo);

        if(index == -1){
            System.out.println("error!!");
            System.exit(0);
        }else{
            System.out.print("パスワードを入力してください: ");
            String password = scan.nextLine();

            if(account.checkPassword(password,accountInfo,index)){
                System.out.println("ログイン完了");
            }else{
                System.out.println("不正なアクセス");
            }
            System.exit(0);
        }
    }
}
