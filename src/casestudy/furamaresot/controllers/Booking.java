package casestudy.furamaresot.controllers;


import casestudy.furamaresot.models.Customer;
import casestudy.furamaresot.models.House;
import casestudy.furamaresot.models.Room;
import casestudy.furamaresot.models.Villa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Booking {
    public static final String PATH = "src\\casestudy\\furamaresot\\data";
    VillaManager villaManager = new VillaManager();
    CustomerManager customerManager = new CustomerManager();
    HouseManager houseManager = new HouseManager();
    RoomManager roomManager = new RoomManager();
    MainController mainController = new MainController();

    public void addNewBooking() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n" +
                "4. \t Return Menu");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                villaManager.showVilla();
                String str1 = checkVilla();
                customerManager.showInformationCustomer();
                System.out.println("Input your id Customer :");
                String customer = checkCustomer();
                customer += str1;
                fileWriter(customer);
                addNewBooking();
                break;
            case 2:
                houseManager.showHouse();
                String str2 = checkHouse();
                customerManager.showInformationCustomer();
                System.out.println("Input your id Customer :");
                String customer1 = checkCustomer();
                customer1 += str2;
                fileWriter(customer1);
                addNewBooking();
                break;
            case 3:
                roomManager.showRoom();
                String str3 = checkRoom();
                customerManager.showInformationCustomer();
                System.out.println("Input your id Customer :");
                String customer2 = checkCustomer();
                customer2 += str3;
                fileWriter(customer2);
                addNewBooking();
                break;
            case 4:
                mainController.displayMainMenu();
                break;
            default:
                break;
        }


    }

    //-----------------------------------------------------
    public String checkCustomer() {
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        for (Customer customer : customerManager.readCSVFile()) {
            if (check.equals(customer.getId())) {
                return customer.toString();
            }
        }
        return null;
    }

    public String checkVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your id villa : ");
        String check = scanner.nextLine();
        for (Villa villa : villaManager.readCSVFileVilla()) {
            if (check.equals(villa.getId())) {
                return villa.toString();
            }
        }
        return null;
    }

    public String checkHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your id house :");
        String check = scanner.nextLine();
        for (House house : houseManager.readCSVFileHouse()) {
            if (check.equals(house.getId())) {
                return house.toString();
            }
        }
        return null;
    }

    public String checkRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your id room :");
        String check = scanner.nextLine();
        for (Room room : roomManager.readCSVFileRoom()) {
            if (check.equals(room.getId())) {
                return room.toString();
            }
        }
        return null;
    }

    public void fileWriter(String customer) {
        File dir = new File(PATH);
        dir.mkdir();
        File file = new File(PATH, "\\Booking.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(PATH + "\\Booking.csv");
            fileWriter.write(String.valueOf(customer));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //-----------------------------------------------------------------
}
