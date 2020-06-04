package VongLap.baitap.bai2.songuyentodautien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numbers ;
        Scanner numb = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra.");
        numbers = numb.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers ){
            int check = 0 ;
            for (int i = 1; i <= N ; i ++){
                if(N % i == 0){
                    check++;
                }
            }
            if (check == 2 ){
                count ++ ;
                System.out.println(N + " , ");
            }
            N++;
        }
    }
}
