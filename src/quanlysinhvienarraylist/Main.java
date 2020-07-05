package quanlysinhvienarraylist;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       Main main = new Main();
       main.showMenu();
    }

    public void showMenu() throws IOException {
        System.out.println();
        System.out.println("---------Student Manager----------");
        System.out.println("1. Add new Student \n 2. Show Student \n 3. Update Student \n 4. Remove Student \n 5. exit");
        System.out.println("Input choose : ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        StudentManager studentManager = new StudentManager(FileUntil.readCSVFile());
        switch (choose){
            case 1 :
                studentManager.addStudent(); showMenu(); break;
            case 2 :
                studentManager.showStudent(); showMenu(); break;
            case 3 :
                studentManager.updateStudent(); showMenu(); break;
            case 4 :
                studentManager.remove(); showMenu(); break;
            case 5 : return;
            default: return;
        }
    }
}
