package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    public static final String PATH = "src\\casestudy\\furamaresot\\data";
    public static final String COMMA = ",";
    List<Customer> customerList;

    public CustomerManager(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public CustomerManager() {
        customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        Regex regex = new Regex();
        try {
            boolean check = false;
            String name = "";
            String email = "";
            String sex = "";
            String idcard = "";
            String birth = "";
            System.out.println("Input your id : ");
            String id = scanner.nextLine();
            while (!check) {
                System.out.println("Input your name : ");
                name = scanner.nextLine();
                if (regex.regexName(name)) {
                    check = true;
                    break;
                } else {
                    System.out.println("name error");
                    check = false;
                }
            }
            while (!check){
                System.out.println("Input your birthday : ");
                 birth = scanner.nextLine();
                 if(regex.regexBIRTH(birth)){
                     check = true;
                     break;
                 }else {
                     System.out.println("birthday error");
                     check = false;
                 }
            }
            while (!check) {
                System.out.println("Input your sex : ");
                sex = scanner.nextLine();
                if (regex.regexMale(sex)) {
                    sex = regex.male(sex);
                    check = true;
                    break;
                } else {
                    System.out.println(" sex error ");
                    check = false;
                }
            }
            while(!check) {
                System.out.println("Input your Id card : ");
                 idcard = scanner.nextLine();
                if(regex.regexCMND(idcard)){
                    check = true;
                    break;
                }else {
                    System.out.println(" Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX ");
                    check = false;
                }
            }
            System.out.println("Input your phone : ");
            int phone = Integer.parseInt(scanner.nextLine());
            System.out.println("Input your email : ");
            while (!check) {
                email = scanner.nextLine();
                if (regex.regexEmail(email)) {
                    check = true;
                    break;
                } else {
                    System.out.println("email error ");
                    check=false;
                }
            }
            System.out.println("Input your type : ");
            String type = scanner.nextLine();
            System.out.println("Input your address : ");
            String add = scanner.nextLine();

            Customer customer = new Customer(id, name, birth, sex, idcard, phone, email, type, add);
            customerList.add(customer);
            writeFile(customer, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //-----------------------------------------------------------------
    public List<Customer> readCSVFile() {
        File dir = new File(PATH);
        dir.mkdir();
        File file = new File(PATH, "\\Customer.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = null;
        List<Customer> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH + "\\Customer.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Customer customer;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                customer = new Customer(arrStr[0], arrStr[1], arrStr[2], arrStr[3],
                        arrStr[4], Integer.parseInt(arrStr[5]), arrStr[6], arrStr[7], arrStr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    //-----------------------------------------------------------------
    public static void writeFile(Customer customer, boolean append) {
        File dir = new File(PATH);
        dir.mkdir();
        File file = new File(PATH, "\\Customer.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (customer == null) return;
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(PATH + "\\Customer.csv", append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(customer.getId()).append(COMMA);
            buffer.append(customer.getNameCustomer()).append(COMMA);
            buffer.append(customer.getBirCustomer()).append(COMMA);
            buffer.append(customer.getSexCustomer()).append(COMMA);
            buffer.append(customer.getIdCustomer()).append(COMMA);
            buffer.append(customer.getPhoneCustomer()).append(COMMA);
            buffer.append(customer.getEmailCustomer()).append(COMMA);
            buffer.append(customer.getTypeCustomer()).append(COMMA);
            buffer.append(customer.getAddressCustomer()).append(COMMA);
            buffer.append(customer.getServicesCustomer()).append(COMMA);

            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
