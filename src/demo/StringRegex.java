package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {
    public static void main(String[] args) {
//        Cách 1
//        Pattern pattern = Pattern.compile(".s");
//        Matcher matcher = pattern.matcher("as");
//        System.out.println(matcher.matches());

//        Cách 2
//        boolean b2 = Pattern.compile(".s").matcher("as").matches();
//        System.out.println(b2);

//        Cách 3:
//

        /**
         * Các quy  boolean b3 = Pattern.matches("..s", "12sa");
         * //        System.out.println(b3);tắc viết biểu thức chính quy
         */

        Scanner scanner = new Scanner(System.in);
//        Chỉ định chính các 1 ký tự
//        System.out.println("Vui lòng nhập ký tự a");
//        String str = scanner.nextLine();
//        if (Pattern.matches("a",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

        //Chỉ định 1 ký tự bất kỳ
//        System.out.println("Nhập theo định dạng Ja(x)a: với x là ký tự bất kỳ ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("Ja.a",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

        //Biểu thức hoặc cho nhóm ký tự (ab|cd)
//        System.out.println("Bạn chọn ngôn ngữ Java hay PHP: ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("(Java|PHP)",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

        //Biểu thức hoặc theo ký tự
//        System.out.println("Chọn đáp án a,b,c hoặc d:  ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("[abcd]",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

//        System.out.println("Không được nhập a,b,c,d :  ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("[^abcd]",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

//        System.out.println("Nhập từ a-z:  ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("[a-zA-Z]",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

//
//        System.out.println("Nhập từ a-d hoặc f-h :  ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("[a-d[f-h]]",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }


//        System.out.println("Nhập từ a-d và c-g :  "); //Giao tập hợp các ký tự của a-d và c-g
//        String str = scanner.nextLine();
//        if (Pattern.matches("[a-d&&[c-g]]",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }


//        System.out.println("Nhập một số:  ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("\\d",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }


//        System.out.println("Nhập 1 ký tự không phải là một số:  ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("\\D",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }


//        System.out.println("Nhập theo định dạng ab hoặc abab..:   ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("(ab)*",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }


//        System.out.println("Nhập theo định dạng chuỗi aaa...b:    ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("a+b",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }


//        System.out.println("Nhập Java hoặc JJava:    ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("J?Java",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

//        System.out.println("Nhập 1 số có  4  chữ số :    ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("\\d{4}",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }

//        System.out.println("Nhập 1 số ít nhất có 4 chữ số :    ");
//        String str = scanner.nextLine();
//        if (Pattern.matches("\\d{4,}",str)){
//            System.out.println("Input true");
//        }else {
//            System.out.println("Input false");
//        }


        System.out.println("Nhập 1 số ít nhất có 4 chữ số và nhiều nhất có 6 chữ số :    ");
        String str = scanner.nextLine();
        if (Pattern.matches("\\d{4,6}",str)){
            System.out.println("Input true");
        }else {
            System.out.println("Input false");
        }
    }
}
