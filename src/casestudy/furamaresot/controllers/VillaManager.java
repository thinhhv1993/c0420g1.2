package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.Villa;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaManager {
    List<Villa> villaList;

    public VillaManager() {
        villaList = new ArrayList<>();
    }

    public VillaManager(List<Villa> villaList) {
        this.villaList = villaList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<Villa> villaList) {
        this.villaList = villaList;
    }

    public void addNewVilla(){
        MainController mainController = new MainController();
        Scanner scanner = new Scanner(System.in);
        Regex regex = new Regex();
        String id = "";
        try {
            System.out.println("Input id villa :");
            id = scanner.nextLine();
            System.out.println("Input name villa :");
            String name = scanner.nextLine();
            System.out.println("Input acreage villa :");
            double acreage = Double.parseDouble(scanner.nextLine());
            System.out.println("Input price villa :");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Input max number people :");
            int people = Integer.parseInt(scanner.nextLine());
            System.out.println("Input your day :");
            int day = Integer.parseInt(scanner.nextLine());
            System.out.println("Input standard Room :");
            String standardRoom = scanner.nextLine();
            System.out.println("Input your convenient :");
            String convenient = scanner.nextLine();
            System.out.println("Input your acreage pool :");
            String acreagePool = scanner.nextLine();
            System.out.println("Input your number floor :");
            int numbfloor = Integer.parseInt(scanner.nextLine());

            Villa villa = new Villa(id,name,acreage,price,people,day,standardRoom,convenient,acreagePool,numbfloor);
            villaList.add(villa);
            mainController.writeCSVFileVilla(villa,true);
            mainController.addNewServices();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void showVilla(){
        MainController mainController = new MainController();
        for (Villa villa: mainController.readCSVFileVilla()) {
            villa.showInfor();
        }
    }

    public void showVillaName(){
        MainController mainController = new MainController();
        for (Villa villa: mainController.readCSVFileVilla()) {
            System.out.println(villa.getName());
        }
    }
}
