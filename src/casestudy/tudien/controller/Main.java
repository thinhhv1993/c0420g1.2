package casestudy.tudien.controller;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String PATH = "src\\casestudy\\tudien\\data";
    static List<KeyWord> keyWordLinkedList = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        try {
            main.createFileData();
            main.convertData();
        } catch (IOException | ClassNotFoundException e) {
            main.keyWordLinkedList.clear();
            main.convertFile();
            System.out.println("IOException | ClassNotFoundException");
        }
        main.showMenu();
    }

    public void showMenu(){
        System.out.println();
        System.out.println("Action : lookup/define/drop/exportFile");
        System.out.print("Action : ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        String[] action1 = action.split(" ");
        try {
        switch (action1[0]) {
            case "lookup":
                KeywordManager keywordManager = new KeywordManager();
                keywordManager.lookup(action1[1]);
                showMenu();
                break;
            case "define":

                    KeywordManager keywordManager1 = new KeywordManager();
                    keywordManager1.addKeyword(action1[1]);
                    showMenu();
                    break;

            case "drop":
                KeywordManager keywordManager2 = new KeywordManager();
                keywordManager2.drop(action1[1]);
                showMenu();
                break;
            case "exportFile":
                exportFile();
                showMenu();
                break;
            default:
                System.out.println("please input it's correct format");
                showMenu();
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void createFileData() throws IOException {
        File dir = new File("src\\casestudy\\tudien\\data");
        dir.mkdir();
        File file = new File(PATH, "keyword.txt");
        if (!file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH + "\\keyword.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(keyWordLinkedList);
            fileOutputStream.close();
            objectOutputStream.close();
        }
    }

    public void convertData() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(PATH + "\\keyword.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        keyWordLinkedList = (List<KeyWord>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
    }

    public void convertFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(PATH + "\\keyword.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(keyWordLinkedList);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    public void exportFile() throws IOException, ClassNotFoundException {
        File dir = new File("C:\\Users\\Admin\\Desktop");
        dir.mkdir();
        FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\Desktop"+"\\keyword.txt");

        for (KeyWord keyWord : keyWordLinkedList){
            fileWriter.write(keyWord.toString());
        }
        fileWriter.close();
    }
}

