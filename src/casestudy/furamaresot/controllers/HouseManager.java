package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseManager {
    List<House> houseList;

    public HouseManager() {
        houseList = new ArrayList<>();
    }

    public HouseManager(List<House> houseList) {
        this.houseList = houseList;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public void addNewHouse(){
        MainController mainController = new MainController();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Input id house :");
            String id = scanner.nextLine();
            System.out.println("Input name house :");
            String name = scanner.nextLine();
            System.out.println("Input acreage house :");
            double acreage = Double.parseDouble(scanner.nextLine());
            System.out.println("Input price house :");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Input max number house :");
            int people = Integer.parseInt(scanner.nextLine());
            System.out.println("Input your day :");
            int day = Integer.parseInt(scanner.nextLine());
            System.out.println("Input standard Room :");
            String standardRoom = scanner.nextLine();
            System.out.println("Input your convenient :");
            String convenient = scanner.nextLine();
            System.out.println("Input your number floor :");
            int numbfloor = Integer.parseInt(scanner.nextLine());

            House house = new House(id,name,acreage,price,people,day,standardRoom,convenient,numbfloor);
            houseList.add(house);
            mainController.writeCSVFileHouse(house,true);
            mainController.addNewServices();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void showHouse(){
        MainController mainController = new MainController();
        for (House house: mainController.readCSVFileHouse()) {
            house.showInfor();
        }
    }

    public void showHouseName(){
        MainController mainController = new MainController();
        for (House house: mainController.readCSVFileHouse()) {
            System.out.println(house.getName());
        }
    }
}
