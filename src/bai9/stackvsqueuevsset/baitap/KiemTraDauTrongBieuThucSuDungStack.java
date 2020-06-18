package bai9.stackvsqueuevsset.baitap;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauTrongBieuThucSuDungStack {
    public static void main(String[] args) {
        System.out.print("Nhập biểu thức cần kiểm tra :");
        Scanner scn = new Scanner(System.in);
        String scn1 = scn.nextLine();
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < scn1.length(); i++) {
            String character = scn1.substring(i, i + 1);
            if(character.equals("(")){
            stack.push(character);
            }else if (character.equals(")")){
                stack1.push(character);
            }
        }
        if(stack.size()==stack1.size()){
            System.out.println("Biểu thức đúng");
        }else {
            System.out.println("Biểu thức sai");
        }
    }
}
