package casestudy.furamaresot.controllers;

import java.util.Scanner;

public class ServiceManager {
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
                MainController mainController = new MainController();
                mainController.displayMainMenu();
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
                MainController mainController = new MainController();
                mainController.displayMainMenu();
                break;
            case 5:
                return;
            default:
                break;
        }
    }
}
