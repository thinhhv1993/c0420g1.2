package VongLap.baitap.bai1.thietkemenuhienthicacloaihinh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Print isosceles triangle");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                }

                case 2: {
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j <= i) {
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 3: {
                    for(int i=7;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 4: {
//                    for(int i=1;i<=5;i++){
//                        for(int j=1;j<=9;j++){
//                            if (i == 1 && j < 5 || i == 1 && j > 5) {
//                                System.out.print(" ");
//                            }else if (i== 2 && j < 4 ||i== 2 && j > 6){
//                                    System.out.print(" ");
//                                }
//                                else if (i == 3 && j < 3 ||i== 3 && j > 7) {
//                                    System.out.print(" ");
//                                } else if (i == 4 && j < 2 || i == 4 && j > 8){
//                                    System.out.print(" ");
//                                } else if (i == 5){
//                                    System.out.print("*");
//                            }else {
//                                System.out.print("*");
//                            }
//                        }
//                        System.out.print("\n");
//                    }
                    System.out.println("Nhap canh tam giac:");
                    int canh2 = input.nextInt();
                    System.out.println("Print isosceles triangle");
                    for (int i=0;i<canh2;i++) {
                        for (int j=0;j<canh2-i;j++) {
                            System.out.print(" ");
                        }
                        for (int j=canh2-i;j<canh2;j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case  5 :    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
