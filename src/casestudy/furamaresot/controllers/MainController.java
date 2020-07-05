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
                ServiceManager serviceManager = new ServiceManager();
                serviceManager.addNewServices();
                break;
            case 2:
                ServiceManager serviceManager1 = new ServiceManager();
                serviceManager1.showServices();
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
}
