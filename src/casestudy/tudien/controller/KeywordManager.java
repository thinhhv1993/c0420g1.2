package casestudy.tudien.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.List;
import java.util.Scanner;

public class KeywordManager {
    Main main = new Main();
    List<KeyWord> keyWordList = main.keyWordLinkedList ;
    public static final String PATH = "src\\casestudy\\tudien\\data\\keyword.txt";

    public KeywordManager() {
    }

    public KeywordManager(List<KeyWord> keyWordList) {
        this.keyWordList = keyWordList;
    }

    public List<KeyWord> getKeyWordList() {
        return keyWordList;
    }

    public void setKeyWordList(List<KeyWord> keyWordList) {
        this.keyWordList = keyWordList;
    }

    @Override
    public String toString() {
        return "KeywordManager{" +
                "keyWordList=" + keyWordList +
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
            stringBuilder.append(scanner.nextLine());
            keyWord.setDefine(stringBuilder);
        }while (true);
        keyWordList.add(keyWord);
        objectOutputStream.writeObject(keyWordList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public void lookup(String string) throws IOException, ClassNotFoundException {
        boolean check = false;
        int index = 0;
        Main main = new Main();
        main.convertData();
        for (KeyWord keyWord : main.keyWordLinkedList) {
            if (string.equals(keyWord.getNameKey())) {
                check = true;
                break;
            }
            index++;
        }
        if (check) {
            System.out.println(main.keyWordLinkedList.get(index).toString());
        } else {
            System.out.println("Keyword not in list");
        }
    }

    public boolean drop(String string) throws IOException, ClassNotFoundException {
        Main main = new Main();
        main.convertData();
        for (KeyWord keyWord : main.keyWordLinkedList) {
            if (string.equals(keyWord.getNameKey())) {
               main.keyWordLinkedList.remove(keyWord);
                return true;
            }
        }
        return false;
    }


}
