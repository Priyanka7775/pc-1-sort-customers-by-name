package com.jap.customers;



import java.util.*;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
public List<String> getListOfCustomersSortedByName(List<Customer> customerList){
    List<String> stringList=new ArrayList<>();
    Collections.sort(customerList);
    Iterator<Customer>iterator=customerList.iterator();
    while (iterator.hasNext()){
        stringList.add(iterator.next().getCustomerName());
    }
    return stringList;
}

    public static void main(String[] args) {
        CustomerService customerService=new CustomerService();
        List<Customer> customerList= Arrays.asList(
                new Customer(1101,"Tara","Female",true,"Austin"),
                new Customer(5242,"Sam","Male",false,"Denver"),
                new Customer(8965,"Abbie","Female",false,"Chicago"),
                new Customer(3354,"Michelle","Female",false,"Portland"),
                new Customer(2212,"Mary","Female",true,"New Orleans"),
                new Customer(4542,"John","Male",false,"Seattle"),
                new Customer(1119,"Trevor","Male",false,"Boston"));

        System.out.println(customerService.getListOfCustomersSortedByName(customerList));
    }


}
