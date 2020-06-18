package bai9.stackvsqueuevsset.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeNhiPhanSangHeThapPhan {
    public static void main(String[] args) {

        System.out.print("Nhập số cần chyển đổi:");

        Scanner sc = new Scanner(System.in);

        Long inputNumb = sc.nextLong();

        Stack<Integer> stack = new Stack<>();

        while(inputNumb!=0) {

            if (inputNumb%2 == 0) {

                stack.push(0);

                inputNumb /= 2;

            } else {

                stack.push(1);

                inputNumb = (inputNumb-1)/2;

            }

        }

        System.out.println("Sau khi chuyển đổi thành dãy nhị phân : ");

        while(!stack.isEmpty()) {

            System.out.print(stack.pop()+" ");

        }

    }
}
