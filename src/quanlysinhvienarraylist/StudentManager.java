package quanlysinhvienarraylist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> studentList;
    public static final String FILE_PATH = "src\\quanlysinhvienarraylist";

    public StudentManager() {
    }

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "studentList=" + studentList +
                '}';
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\student.csv");
            bufferedReader = new BufferedReader(fileReader);
            int index = 0;
            while ((bufferedReader.readLine()) != null) {
                index++;
            }
            bufferedReader.close();
            System.out.println("Enter Your Name : ");
            String name = scanner.nextLine();
            System.out.println("Enter your class :  ");
            String class1 = scanner.nextLine();
            System.out.println("Enter your sex : ");
            String sex = scanner.nextLine();

            Student student = new Student(index,name,class1,sex);
            studentList.add(student);
            FileUntil fileUntil = new FileUntil();
            fileUntil.writeCSVFile(student,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean updateStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your id :");
        int id = Integer.parseInt(scanner.nextLine());
        BufferedReader bufferedReader = null;
        List<Student> studentList = new ArrayList<>();
        FileUntil fileUntil = new FileUntil();
        try {
            FileReader fileReader = new FileReader(FILE_PATH+"\\student.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Student student;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                student = new Student(Integer.parseInt(arrStr[0]), arrStr[1], arrStr[2], arrStr[3]);
                studentList.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean check = false;
        for (Student student :studentList){
            if(id == student.getId()){
                System.out.println("Enter Your Name : ");
                String name = scanner.nextLine();
                System.out.println("Enter your class :  ");
                String class1 = scanner.nextLine();
                System.out.println("Enter your sex : ");
                String sex = scanner.nextLine();
                Student student1 = new Student(id,name,class1,sex);
                studentList.set(id,student1);
                FileWriter fileWriter = new FileWriter(FILE_PATH+"\\student.csv");
                fileWriter.write("");
                check = true;
                break;
            }
        }
        if (check){
            for (Student student2 : studentList){
                fileUntil.writeCSVFile(student2,true);
            }
            return true;
        }else {
            System.out.println("id not in list student");
            return false;
        }
    }

    public boolean remove() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your id :");
        int id = scanner.nextInt();
        BufferedReader bufferedReader = null;
        List<Student> studentList = new ArrayList<>();
        FileUntil fileUntil = new FileUntil();
        try {
            FileReader fileReader = new FileReader(FILE_PATH+"\\student.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Student student;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                student = new Student(Integer.parseInt(arrStr[0]), arrStr[1], arrStr[2], arrStr[3]);
                studentList.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean check = false;
        for (Student student :studentList){
            if(id == student.getId()){
                studentList.remove(student);
                FileWriter fileWriter = new FileWriter(FILE_PATH+"\\student.csv");
                fileWriter.write("");
                check = true;
                break;
            }
        }
        if (check){
            for (int i = id; i < studentList.size();i++){
                studentList.get(i).setId(id);
            }
            for (Student student : studentList){
                fileUntil.writeCSVFile(student,true);
            }
            return true;
        }else
            System.out.println("id not is student list");
        return false;
    }

    public void showStudent(){
       for (Student student : studentList){
           System.out.println(student.toString());
       }
    }
}