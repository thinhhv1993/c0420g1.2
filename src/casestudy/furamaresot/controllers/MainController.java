package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.House;
import casestudy.furamaresot.models.Room;
import casestudy.furamaresot.models.Villa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static final String FILE_PATH = "src\\casestudy\\furamaresot\\data";
    public static final String COMMA = ",";
    VillaManager villaManager = new VillaManager(readCSVFileVilla());
    HouseManager houseManager = new HouseManager(readCSVFileHouse());
    RoomManager roomManager = new RoomManager(readCSVFileRoom());

    public void displayMainMenu() {
        System.out.println();
        System.out.println("----------------- Furama Resort Manager Program-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Services \n 2. Show Services \n 3. Add New Customer \n " +
                "4. Show Information of Customer \n 5. Add New Booking \n " +
                "6. Show Information of Employee \n 7. Exit \n ------------------------------------- \n Input your function :");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
//            case 3 : addNewCustomer(); break;
//            case 4 : showInformationCustomer(); break;
//            case 5 : addNewBooking(); break;
//            case 6 : showInformationOfEmployee();break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }

    public void showServices() {
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
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\tAdd New Villa \n 2.\tAdd New House \n 3.\tAdd New Room \n 4.\tBack to menu \n 5.\tExit \n  \\n Input your Services : ");
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

    public List<Villa> readCSVFileVilla() {
        File dir = new File(FILE_PATH);
        dir.mkdir();
        File file = new File(FILE_PATH, "\\Villa.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = null;
        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\Villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Villa villa;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                villa = new Villa(arrStr[0], arrStr[1], Double.parseDouble(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]), Integer.parseInt(arrStr[5]), arrStr[6], arrStr[7], arrStr[8], Integer.parseInt(arrStr[9]));
                villaList.add(villa);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    public void writeCSVFileVilla(Villa villa, boolean append) {
        File dir = new File(FILE_PATH);
        dir.mkdir();
        File file = new File(FILE_PATH, "\\Villa.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            } else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (villa == null) return;
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH + "\\Villa.csv", append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(villa.getId()).append(COMMA);
            buffer.append(villa.getName()).append(COMMA);
            buffer.append(villa.getAcreage()).append(COMMA);
            buffer.append(villa.getPrice()).append(COMMA);
            buffer.append(villa.getNumbPeople()).append(COMMA);
            buffer.append(villa.getNumbDay()).append(COMMA);
            buffer.append(villa.getStandardRoom()).append(COMMA);
            buffer.append(villa.getConvenient()).append(COMMA);
            buffer.append(villa.getAcreagePool()).append(COMMA);
            buffer.append(villa.getNumbFloor()).append(COMMA);

            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<House> readCSVFileHouse() {
        File dir = new File(FILE_PATH);
        dir.mkdir();
        File file = new File(FILE_PATH, "\\House.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = null;
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\House.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                house = new House(arrStr[0], arrStr[1], Double.parseDouble(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]), Integer.parseInt(arrStr[5]), arrStr[6], arrStr[7], Integer.parseInt(arrStr[8]));
                houseList.add(house);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public void writeCSVFileHouse(House house, boolean append) {
        File dir = new File(FILE_PATH);
        dir.mkdir();
        File file = new File(FILE_PATH, "\\House.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            } else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (house == null) return;
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH + "\\House.csv", append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(house.getId()).append(COMMA);
            buffer.append(house.getName()).append(COMMA);
            buffer.append(house.getAcreage()).append(COMMA);
            buffer.append(house.getPrice()).append(COMMA);
            buffer.append(house.getNumbPeople()).append(COMMA);
            buffer.append(house.getNumbDay()).append(COMMA);
            buffer.append(house.getStandardRoom()).append(COMMA);
            buffer.append(house.getConvenient()).append(COMMA);
            buffer.append(house.getNumbFloor()).append(COMMA);

            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Room> readCSVFileRoom() {
        File dir = new File(FILE_PATH);
        dir.mkdir();
        File file = new File(FILE_PATH, "\\Room.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = null;
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\Room.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Room room;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                room = new Room(arrStr[0], arrStr[1], Double.parseDouble(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]), Integer.parseInt(arrStr[5]), arrStr[6]);
                roomList.add(room);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public void writeCSVFileRoom(Room room, boolean append) {
        File dir = new File(FILE_PATH);
        dir.mkdir();
        File file = new File(FILE_PATH, "\\Room.csv");
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            } else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (room == null) return;
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH + "\\Room.csv", append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(room.getId()).append(COMMA);
            buffer.append(room.getName()).append(COMMA);
            buffer.append(room.getAcreage()).append(COMMA);
            buffer.append(room.getPrice()).append(COMMA);
            buffer.append(room.getNumbPeople()).append(COMMA);
            buffer.append(room.getNumbDay()).append(COMMA);
            buffer.append(room.getSaleService()).append(COMMA);


            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
