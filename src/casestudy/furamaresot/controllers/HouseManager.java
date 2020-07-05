package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.AccompaniedService;
import casestudy.furamaresot.models.House;

import java.io.*;
import java.util.*;

public class HouseManager {
    public static final String FILE_PATH = "src\\casestudy\\furamaresot\\data";
    public static final String COMMA = ",";
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

    public void addNewHouse() {
        ServiceManager serviceManager = new ServiceManager();
        Scanner scanner = new Scanner(System.in);
        Regex regex = new Regex();
        AccompaniedService accompaniedService ;
        String aservice ;
        String id ;
        String name;
        double acreage;
        int price;
        int people;
        try {
            while (true) {
                System.out.println("Input id House :");
                System.out.println("House Format HOVL-YYYY vs Y in number  ");
                id = scanner.nextLine();
                if(regex.regexIdHouse(id))
                    break;
            }
            while (true) {
                System.out.println("Input name House :");
                name = scanner.nextLine();
                if(regex.regexName(name))
                    break;
            }
            while (true) {
                System.out.println("Input acreage House :");
                acreage = Double.parseDouble(scanner.nextLine());
                if(acreage > 30.0){
                    break;
                }else {
                    System.out.println("acreage > 30");
                }
            }
            while (true) {
                System.out.println("Input price House :");
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
            System.out.println("Input standard Room :");
            String standardRoom = scanner.nextLine();
            System.out.println("Input your convenient :");
            String convenient = scanner.nextLine();
            System.out.println("Input your number floor :");
            int numbfloor = Integer.parseInt(scanner.nextLine());
            System.out.println("Do your wan book Accompanied Service : (yes/no)");
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

            House house = new House(id, name, acreage, price, people, day, aservice, standardRoom, convenient, numbfloor);
            writeCSVFileHouse(house, true);
            serviceManager.addNewServices();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void showHouse() {
        for (House house : readCSVFileHouse()) {
            house.showInfor();
        }
    }

    public void showHouseName() {
        for (House house : readCSVFileHouse()) {
            System.out.println(house.getName());
        }
    }

    public TreeSet<House> readCSVFileHouse() {
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
        TreeSet<House> houseList = new TreeSet<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\House.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");

                house = new House(arrStr[0], arrStr[1], Double.parseDouble(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]), Integer.parseInt(arrStr[5]), arrStr[6], arrStr[7], arrStr[8], Integer.parseInt(arrStr[9]));
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
            buffer.append(house.getaService()).append(COMMA);
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
}
