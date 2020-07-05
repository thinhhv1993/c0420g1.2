package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.AccompaniedService;
import casestudy.furamaresot.models.Villa;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class VillaManager {
    List<Villa> villaList;
    public static final String FILE_PATH = "src\\casestudy\\furamaresot\\data";
    public static final String COMMA = ",";
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
        ServiceManager serviceManager = new ServiceManager();
        Scanner scanner = new Scanner(System.in);
        Regex regex = new Regex();
        AccompaniedService accompaniedService = null;
        String id = "";
        String acreagePool="";
        double acreage=0;
        int price = 0;
        int people =0;
        String aservice = "";
        String name ="";
        try {
            do {
                System.out.println("Input id villa :");
                System.out.println("Villa Format SVVL-YYYY vs Y in number  ");
                id = scanner.nextLine();
            } while (!regex.regexIdvila(id));
            do {
                System.out.println("Input name villa :");
                name = scanner.nextLine();
            } while (!regex.regexName(name));
            while (true) {
                System.out.println("Input acreage villa :");
                 acreage = Double.parseDouble(scanner.nextLine());
                if(acreage > 30.0){
                    break;
                }else {
                    System.out.println("acreage > 30");
                }
            }
            while (true) {
                System.out.println("Input price villa :");
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
            while (true){
                System.out.println("Input your acreage pool :");
                 acreagePool = scanner.nextLine();
                if(Integer.parseInt(acreagePool) > 30 ){
                    break;
                }else
                    System.out.println("acreage poll > 30 ");
            }
            System.out.println("Input your number floor :");
            int numbfloor = Integer.parseInt(scanner.nextLine());
            System.out.println("Do your wan book Accompanied Service : (yes/no)");
            String service = scanner.nextLine();
            if (service.equals("yes")) {
                label:
                while (true) {
                    System.out.println("Input your massage | karaoke | food | drink | car.");
                    System.out.println("Inpt your Accompanied service : ");
                     aservice = scanner.nextLine();
                    if (regex.regexService(aservice)) {
                        switch (aservice) {
                            case "massage":
                                accompaniedService = AccompaniedService.massage;
                                break label;
                            case "karaoke":
                                accompaniedService = AccompaniedService.karaoke;
                                break label;
                            case "food":
                                accompaniedService = AccompaniedService.food;
                                break label;
                            case "drink":
                                accompaniedService = AccompaniedService.drink;
                                break label;
                            case "car":
                                accompaniedService = AccompaniedService.car;
                                break label;
                        }
                    }
                }
                aservice = accompaniedService.toString();
            }else
                aservice = null;

            Villa villa = new Villa(id,name,acreage,price,people,day,aservice,standardRoom,convenient,acreagePool,numbfloor);
            writeCSVFileVilla(villa,true);
            serviceManager.addNewServices();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void showVilla(){
        for (Villa villa: readCSVFileVilla()) {
            villa.showInfor();
        }
    }

    public void showVillaName(){
        for (Villa villa: readCSVFileVilla()) {
            System.out.println(villa.getName());
        }
    }

    public TreeSet<Villa> readCSVFileVilla() {
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
        TreeSet<Villa> villaList = new TreeSet<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\Villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Villa villa;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                villa = new Villa(arrStr[0], arrStr[1], Double.parseDouble(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]), Integer.parseInt(arrStr[5]), arrStr[6],arrStr[7], arrStr[8], arrStr[9], Integer.parseInt(arrStr[10]));
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
            buffer.append(villa.getaService()).append(COMMA);
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
}
