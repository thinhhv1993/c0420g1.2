package casestudy.furamaresot.controllers;

import casestudy.furamaresot.models.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer, Customer t1) {
        if((customer.getNameCustomer()).compareTo(t1.getNameCustomer())==0){
            if((customer.getBirCustomer()).compareTo(t1.getBirCustomer())<0) return -1;
            else if((customer.getBirCustomer()).compareTo(t1.getBirCustomer())>0) return 1;
            else if((customer.getBirCustomer()).compareTo(t1.getBirCustomer())==0) return 0;
        }
        else if((customer.getNameCustomer()).compareTo(t1.getNameCustomer())<0) return -1;
        else if((customer.getNameCustomer()).compareTo(t1.getNameCustomer())>0) return 1;
        return 0;
    }

}
