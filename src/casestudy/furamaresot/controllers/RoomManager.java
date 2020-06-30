package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManager {
    List<Room> roomList;

    public RoomManager() {
        roomList = new ArrayList<>();
    }

    public RoomManager(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public void addNewRoom() {
        MainController mainController = new MainController();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input id room :");
            String id = scanner.nextLine();
            System.out.println("Input name room :");
            String name = scanner.nextLine();
            System.out.println("Input acreage room :");
            double acreage = Double.parseDouble(scanner.nextLine());
            System.out.println("Input price room :");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("Input max number room :");
            int people = Integer.parseInt(scanner.nextLine());
            System.out.println("Input your day :");
            int day = Integer.parseInt(scanner.nextLine());
            System.out.println("Input saleService : ");
            String saleService = scanner.nextLine();

            Room room = new Room(id, name, acreage, price, people, day, saleService);
            roomList.add(room);
            mainController.writeCSVFileRoom(room, true);
            mainController.addNewServices();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void showRoom(){
        MainController mainController = new MainController();
        for (Room room: mainController.readCSVFileRoom()) {
           room.showInfor();
        }
    }

    public void showRoomName(){
        MainController mainController = new MainController();
        for (Room room: mainController.readCSVFileRoom()) {
            System.out.println(room.getName());
        }
    }
}

