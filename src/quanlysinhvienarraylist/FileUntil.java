package quanlysinhvienarraylist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntil {
    public static final String FILE_PATH = "src\\quanlysinhvienarraylist";
    public static final String COMMA = ",";

    public static List<Student> readCSVFile() {
        File file = new File(FILE_PATH);
        file.mkdir();
        File file1 = new File(FILE_PATH,"\\student.csv");
        try {
            if(file1.createNewFile()){
                System.out.println("file create");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = null;
        List<Student> studentList = new ArrayList<>();
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
        return studentList;
    }

     void writeCSVFile(Student student, boolean append){
        if(student == null) return;

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH+"\\student.csv",append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(student.getId()).append(COMMA);
            buffer.append(student.getName()).append(COMMA);
            buffer.append(student.getClassStudent()).append(COMMA);
            buffer.append(student.getSex()).append(COMMA);

            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
