package casestudy.furamaresot.controllers;


import casestudy.furamaresot.models.Employee;

import java.util.Scanner;

public class MainController {
    public void displayMainMenu() {
        System.out.println();
        System.out.println("----------------- Furama Resort Manager Program-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Services \n 2. Show Services \n 3. Add New Customer \n " +
                "4. Show Information of Customer \n 5. Add New Booking \n " +
                "6. Show Information of Employee \n " +"7. Booking ticket movie\n" + "8. Search Employee \n" +
                "9. Exit \n "+ "------------------------------------- \n Input your function :");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                CustomerManager customerManager = new CustomerManager();
                customerManager.addCustomer();
                displayMainMenu();
                break;
            case 4:
                CustomerManager customerManager1 = new CustomerManager();
                customerManager1.showInformationCustomer();
                displayMainMenu();
                break;
            case 5:
                Booking booking = new Booking();
                booking.addNewBooking();
                break;
            case 6 :
                Employee employee = new Employee();
                employee.showInformationOfEmployee();
                break;
            case 7 :
                CustomerManager customerManager2 = new CustomerManager();
                customerManager2.showInformationCustomer();
                Movie movie = new Movie();
                movie.bookingTicker();
                displayMainMenu();
                break;
            case 8:
                FileEmployee fileEmployee =new FileEmployee();
                fileEmployee.searchEmployee();
                displayMainMenu();
                break;
            case 9:
                return;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }

    public void showServices() {
        VillaManager villaManager = new VillaManager();
        HouseManager houseManager = new HouseManager();
        RoomManager roomManager = new RoomManager();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.	Show all Villa\n 2.	Show all House\n  3. Show all Room " +
                "\n 4.	Show All Name Villa Not Duplicate \n 5.	Show All Name House Not Duplicate " +
                "\n 6.	Show All Name Room Not Duplicate \n 7.	Back to menu \n 8.	Exit \n  Input your Services : ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                villaManager.showVilla();
                showServices();
                break;
            case 2:
                houseManager.showHouse();
                showServices();
                break;
            case 3:
                roomManager.showRoom();
                showServices();
                break;
            case 4:
                villaManager.showVillaName();
                showServices();
                break;
            case 5:
                houseManager.showHouseName();
                showServices();
                break;
            case 6:
                roomManager.showRoomName();
                showServices();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                return;
            default:
        }
    }

    public void addNewServices() {
        VillaManager villaManager = new VillaManager();
        HouseManager houseManager = new HouseManager();
        RoomManager roomManager = new RoomManager();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tAdd New Villa \n 2.\tAdd New House \n 3.\tAdd New Room \n 4.\tBack to menu \n 5.\tExit \n  \n Input your Services : ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                villaManager.addNewVilla();
                addNewServices();
                break;
            case 2:
                houseManager.addNewHouse();
                addNewServices();
                break;
            case 3:
                roomManager.addNewRoom();
                addNewServices();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                return;
            default:
                break;
        }
    }
}
