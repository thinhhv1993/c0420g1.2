package bai16.stringvsregex.baitap.validatesodienthoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static final String PHONEREGEX_REGEX = "[\\d]{2}-[0][\\d]{9}";
    private static Pattern pattern;
    private Matcher matcher;
    public PhoneExample() {
        pattern = Pattern.compile(PHONEREGEX_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        System.out.println("Input phone :");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        boolean isvalid = phoneExample.validate(className);
        System.out.println(isvalid);
    }
}
