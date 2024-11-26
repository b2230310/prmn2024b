package lecture2;

public class Keisan {
    int goukei(int[] num) {
        int n = 0;
        for (int j = 0; j < 5; j++) {
            n += num[j];
        }
        return n;
    }

    void hanbetu(int n){
            if(n >= 100){
                System.out.println("great!");
            }else if(n >= 50){
                System.out.println("big");
            }else{
                System.out.println("small");
            }
        }

    }
