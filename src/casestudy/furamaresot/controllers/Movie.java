package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.Customer;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Movie {

    public void bookingTicker() {
        Scanner scanner = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        Queue<Customer> customerLinkedList = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Input your id customer booking :");
            String check = scanner.nextLine();
            for (Customer customer : customerManager.readCSVFile()) {
                if (check.equals(customer.getId())) {
                    customerLinkedList.offer(customer);
                    break;
                }
            }
        }
        for (Customer customer: customerLinkedList) {
            System.out.println(customer);
        }
    }
}
