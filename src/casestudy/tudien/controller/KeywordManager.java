package casestudy.tudien.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.Scanner;

public class KeywordManager {
    public static final String PATH = "src\\casestudy\\tudien\\data\\keyword.txt";

    public KeywordManager() {
    }


    @Override
    public String toString() {
        return "KeywordManager{" +
                '}';
    }

    public void addKeyword(String string) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(PATH);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        KeyWord keyWord = new KeyWord();
        Scanner scanner = new Scanner(System.in);
        keyWord.setNameKey(string);
        System.out.println("Input your Pronounce ");
        keyWord.setPronounce(scanner.nextLine());
        System.out.println("Input your type Key ");
        keyWord.setType(scanner.nextLine());
        System.out.println("Input your Similar ");
        keyWord.setSimilar(scanner.nextLine());
        String choose = "yes";
        StringBuilder stringBuilder = new StringBuilder();
        do {
            System.out.println("Do you want input your define (yes/no) ");
            choose = scanner.nextLine();
            if(choose.equals("no")) break;
            System.out.println("Input your define ");
            stringBuilder.append(scanner.nextLine()).append("\n");
            keyWord.setDefine(stringBuilder);
        }while (true);
        Main.keyWordLinkedList.add(keyWord);
        objectOutputStream.writeObject(Main.keyWordLinkedList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public void lookup(String string) {
        boolean check = false;
        int index = 0;
        for (KeyWord keyWord : Main.keyWordLinkedList) {
            if (string.equals(keyWord.getNameKey())) {
                check = true;
                break;
            }
            index++;
        }
        if (check) {
            System.out.println(Main.keyWordLinkedList.get(index).toString());
        } else {
            System.out.println("Keyword not in list");
        }
    }

    public boolean drop(String string) {
        for (KeyWord keyWord : Main.keyWordLinkedList) {
            if (string.equals(keyWord.getNameKey())) {
               Main.keyWordLinkedList.remove(keyWord);
                return true;
            }
        }
        return false;
    }


}
