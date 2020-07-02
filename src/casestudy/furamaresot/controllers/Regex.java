package casestudy.furamaresot.controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String NAME_REGEX =  "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    private static final String MALE_REGEX =  "Nam|Nu|Khong";
    private static final String CMND_REGEX = "[\\d]{3,}\\s[\\d]{3,}\\s[\\d]{3,}";
    private static final String BIRTH_REGEX = "^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$";
    private static final String SERVICE_REGEX = "massage|karaoke|food|drink|car";
    private static final String VILLA_REGEX  = "(SVVL)[\\d]{4,}";
    private static final String HOUSE_REGEX  = "(HOVL)[\\d]{4,}";
    private static final String ROOM_REGEX  = "(ROVL)[\\d]{4,}";
    private static Pattern pattern;
    private Matcher matcher;

    boolean regexEmail(String string){
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

     boolean regexName(String string){
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

     boolean regexMale(String string){
        String temp[] = string.split("");
        String str ="";
        str += String.valueOf(temp[0].charAt(0)).toUpperCase();
        for (int i = 1; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toLowerCase();
        }
        pattern = Pattern.compile(MALE_REGEX);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

     String male(String string){
        String temp[] = string.split("");
        String str ="";
        str += String.valueOf(temp[0].charAt(0)).toUpperCase();
        for (int i = 1; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toLowerCase();
        }
        return str;
    }

     boolean regexCMND(String string){
        pattern = Pattern.compile(CMND_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

     boolean regexBIRTH(String string){
        pattern = Pattern.compile(BIRTH_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

     boolean regexService(String string){
        pattern = Pattern.compile(SERVICE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

     boolean regexIdvila(String string){
        pattern = Pattern.compile(VILLA_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
     boolean regexIdRoom(String string){
        pattern = Pattern.compile(ROOM_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
     boolean regexIdHouse(String string){
        pattern = Pattern.compile(HOUSE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
