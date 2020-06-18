package bai9.stackvsqueuevsset.baitap;

import java.util.Stack;

public class DaoNguocPhanTuTrongMangKyTuSuDungStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        String string="abcdefghi";

        pushString(stack, string);

        System.out.println("Before:");

        printStack(stack);

        System.out.println("After:");

        Stack<String> stackReverse=reverseStack(stack);

        printStack(stackReverse);

    }



    private static Stack<String> reverseStack(Stack<String> stack) {

        Stack<String> stackReverse= new Stack<>();

        int stackSize = stack.size();

        for (int i = 0; i< stackSize; i++){

            stackReverse.push(stack.pop());

        }

        return stackReverse;

    }



    private static void printStack(Stack<String> stack) {

        for (int i=0;i<stack.size();i++){

            System.out.println(stack.elementAt(i));

        }

    }



    private static void pushString(Stack<String> stack, String string) {

        for (int i=0; i<string.length();i++){

            String character = string.substring(i, i + 1);

            stack.push(character);

        }

    }
}
