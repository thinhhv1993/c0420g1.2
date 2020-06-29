package bai16.stringvsregex.baitap.validatetencualophoc;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASSNAMEREGEX_REGEX = "[CPA]+[\\d{4,}]+[GHIKLM]";
    public NameClassExample() {
        pattern = Pattern.compile(CLASSNAMEREGEX_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        NameClassExample nameClassExample = new NameClassExample();
        System.out.println("Input class name :");
        Scanner scanner = new Scanner(System.in);
         String className = scanner.nextLine();
        boolean isvalid = nameClassExample.validate(className);
        System.out.println(isvalid);
    }
}
