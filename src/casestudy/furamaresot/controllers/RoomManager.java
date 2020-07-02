package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.AccompaniedService;
import casestudy.furamaresot.models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class RoomManager {
        public static final String FILE_PATH = "src\\casestudy\\furamaresot\\data";
        public static final String COMMA = ",";
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
        Regex regex = new Regex();
        AccompaniedService accompaniedService ;
        String aservice = "";
        String id = "";
        String name = "";
        double acreage ;
        int price ;
        int people;
        try {
            while (true) {
                System.out.println("Input id Room :");
                System.out.println("Room Format ROVL-YYYY vs Y in number  ");
                id = scanner.nextLine();
                if(regex.regexIdRoom(id))
                    break;
            }
            while (true) {
                System.out.println("Input name room :");
                 name = scanner.nextLine();
                if(regex.regexName(name))
                    break;
            }
            while (true) {
                System.out.println("Input acreage room :");
                acreage = Double.parseDouble(scanner.nextLine());
                if(acreage > 30.0){
                    break;
                }else {
                    System.out.println("acreage > 30");
                }
            }
            while (true) {
                System.out.println("Input price room :");
                price = Integer.parseInt(scanner.nextLine());
                if(price>0){
                    break;
                }else {
                    System.out.println("price > 0 ");
                }
            }
            while(true) {
                System.out.println("Input max number people :");
                people = Integer.parseInt(scanner.nextLine());
                if(people>0&&people<20){
                    break;
                }else {
                    System.out.println(" 0 < people < 20 ");
                }
            }
            System.out.println("Input your day :");
            int day = Integer.parseInt(scanner.nextLine());
            System.out.println("Input saleService : ");
            String saleService = scanner.nextLine();System.out.println("Do your wan book Accompanied Service : (yes/no)");
            String service = scanner.nextLine();
            if (service.equals("yes")) {
                while (true) {
                    System.out.println("Input your massage | karaoke | food | drink | car.");
                    System.out.println("Inpt your Accompanied service : ");
                     aservice = scanner.nextLine();
                    if (regex.regexService(aservice)) {
                        if (aservice.equals("massage")) {
                            accompaniedService = AccompaniedService.massage;
                            break;
                        } else if (aservice.equals("karaoke")) {
                            accompaniedService = AccompaniedService.karaoke;
                            break;
                        } else if (aservice.equals("food")) {
                            accompaniedService = AccompaniedService.food;
                            break;
                        } else if (aservice.equals("drink")) {
                            accompaniedService = AccompaniedService.drink;
                            break;
                        } else if (aservice.equals("car")) {
                            accompaniedService = AccompaniedService.car;
                            break;
                        }
                    }
                }
                aservice = accompaniedService.toString();
            }else
                aservice = null;


            Room room = new Room(id, name, acreage, price, people, day,aservice, saleService);
            writeCSVFileRoom(room, true);
            mainController.addNewServices();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void showRoom(){
        for (Room room: readCSVFileRoom()) {
           room.showInfor();
        }
    }

    public void showRoomName(){
        for (Room room: readCSVFileRoom()) {
            System.out.println(room.getName());
        }
    }

    public TreeSet<Room> readCSVFileRoom() {
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
        TreeSet<Room> roomList = new TreeSet<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\Room.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Room room;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                room = new Room(arrStr[0], arrStr[1], Double.parseDouble(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]), Integer.parseInt(arrStr[5]), arrStr[6],arrStr[7],arrStr[8]);
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
            buffer.append(room.getaService()).append(COMMA);
            buffer.append(room.getSaleService()).append(COMMA);


            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

