package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class FileEmployee {
    public void searchEmployee(){
        final String FILE_PATH = "src\\casestudy\\furamaresot\\data";
        Stack<Employee> employeeStack = new Stack<>();
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\Employee.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Employee employee;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                employee = new Employee(arrStr[0], arrStr[1], Integer.parseInt(arrStr[2]), arrStr[3]);
                employeeStack.push(employee);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Enter your name employee :");
        Scanner scanner = new Scanner(System.in);
        String nameEmployee = scanner.nextLine();
        boolean check = false;
        int index = 0;
        for(Employee employee : employeeStack ){
            if(nameEmployee.equals(employee.getFullName())){
                check=true;
                break;
            }
            index++;
        }
        if(check){
            System.out.println(employeeStack.get(index));
        }else {
            System.out.println("No employee ");
        }
    }
}

