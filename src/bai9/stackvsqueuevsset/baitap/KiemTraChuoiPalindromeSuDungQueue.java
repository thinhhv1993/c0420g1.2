package bai9.stackvsqueuevsset.baitap;

import java.util.*;

public class KiemTraChuoiPalindromeSuDungQueue {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        System.out.print("Nhập số cần chyển đổi:");
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            String character = str1.substring(i, i + 1);
            stack.push(character);
        }
        for (int i = 0; i < str1.length(); i++) {
            String character = str1.substring(i, i + 1);
            queue.offer(character);
        }
        boolean check = true;
       for (int i = 0; i < str1.length();i++){
           if(!stack.pop().equals(queue.remove())) {
               check = false;
               break;
           }
       }
        System.out.println(check);
    }
}
