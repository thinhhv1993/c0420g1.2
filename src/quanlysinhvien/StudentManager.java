package quanlysinhvien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    final String PATH = "src/content/StudentData.cvs";
    List<Student> studentsData = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choose = 0;
        while (choose != 2) {
            System.out.println();
            System.out.println("-----------------Product Student Program-----------------");
            System.out.println("1.Menu");
            System.out.println("2.Exit");
            System.out.print("Choose:");
            choose = scanner.nextInt();
            if (choose == 1) {
                try {
                    studentManager.createFileData();
                    studentManager.convertData();
                    if (studentManager.showMenu() == 6) break;
                } catch (IOException | ClassNotFoundException e) {
                    studentManager.studentsData.clear();
                    studentManager.convertFile();
                    System.out.println("IOException | ClassNotFoundException");
                    break;
                }
            }
        }
    }

    private void createFileData() throws IOException {
        File dir = new File("src/content");
        dir.mkdir();
        File file = new File("src/content", "StudentData.cvs");
        if (!file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentsData);
            fileOutputStream.close();
            objectOutputStream.close();
        }
    }

    private void convertData() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(PATH);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        studentsData = (List<Student>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
    }

    private void convertFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(PATH);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(studentsData);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    private int showMenu() throws IOException {
        System.out.println();
        System.out.println("-------------Student Manager program-------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add Student  \n 2. ShowStudent  \n 3. FindStudent \n 4. RemoveStudent  \n  5. Update Student \n 6. Exit ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1 :addStudent(); showMenu(); break;
            case 2 :
                System.out.println("Select the data type you want to display \n 1. All Student \n 2. Class Student");
                int choose1 = scanner.nextInt();
                switch (choose1){
                    case 1 : showStudentData();showMenu();break;
                    case 2 : showClassStudent();showMenu();break;
                } break;
            case 3 : findStudent();showMenu();break;
            case 4 : removeStudent(); showMenu();break;
            case 5 : showStudentData(); updateStudent(); showMenu(); break;
            default: break;
        }
        return choose;
    }
    private void updateStudent() throws IOException {
        FileOutputStream file = new FileOutputStream(PATH);
        ObjectOutputStream osi = new ObjectOutputStream(file);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your ID :");
        int id = scanner.nextInt();
        boolean check = false;
        for (Student student: studentsData) {
            if(student.getId() == id){
                scanner.nextLine();
                System.out.println("Input your name Student");
                student.setName(scanner.nextLine());
                System.out.println("Input your sex ");
                student.setSex(scanner.nextLine());
                System.out.println("Input your Class");
                student.setClassStudent(scanner.nextLine());
                check = true ;
                break;
            }
        } if (check){
            showStudentData();
        }else {
            System.out.println("Not available student in ListStudent");
        }
    }

    private void addStudent() throws IOException {
        FileOutputStream file = new FileOutputStream(PATH);
        ObjectOutputStream osi = new ObjectOutputStream(file);
        Student student;
        String choose = "yes";
        Scanner scanner = new Scanner(System.in);
        while (!"no".equals(choose)) {
            student = new Student();
            System.out.println("Input your ID");
            student.setId(Integer.parseInt(scanner.nextLine()));
            System.out.println("Input your name Student");
            student.setName(scanner.nextLine());
            System.out.println("Input your sex ");
            student.setSex(scanner.nextLine());
            System.out.println("Input your Class");
            student.setClassStudent(scanner.nextLine());
            studentsData.add(student);
            System.out.println("Do you want to continue input Student??(yes/no)");
            choose = scanner.nextLine();
        }
        osi.writeObject(studentsData);
        osi.close();
        file.close();
    }

    private void showClassStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your class name :");
        String className ;
        className = scanner.nextLine();
        System.out.println("-------------List Student Of Class " + className +"---------------");
        boolean check = false;
        String str = "";
        for (Student student: studentsData) {
            if(student.getClassStudent().equals(className)){
              str += student.toString()+"\n";
                check = true;
            }
        }
        if(check){
            System.out.println(str);
        }else {
            System.out.println("Classes without students");
        }
    }

    private void showStudentData() {
        System.out.println("-----------------List Student-----------------");
        for (Student student: studentsData) {
            System.out.println(student.toString());
        }
    }
    private void findStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name Student want find : ");
        String name = scanner.nextLine();
        boolean check = false;
        int index = 0;
        for (Student student: studentsData) {
            if (student.getName().equals(name)){
                check = true;
                break;
            }
            index ++;
        }
        if (check){
            System.out.println(studentsData.get(index));
        }else {
            System.out.println("Not available student in ListStudent");
        }
    }

    private void removeStudent() throws IOException {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID Student to remove : ");
        String Idstudent = scanner.nextLine();
        int ID = 0;
        try{
            ID = Integer.parseInt(Idstudent);
        }catch (Exception e){
            System.out.println("Input error .");
        }
        int index = 0;
        boolean check = false;
        for (Student student: studentsData) {
            if(student.getId() == ID ){
                check = true;
                break;
            }
            index++;
        }
        if(check){
            studentsData.remove(index);
            convertFile();
        }else {
            System.out.println("Not available student in ListStudent");
        }
    }
}
