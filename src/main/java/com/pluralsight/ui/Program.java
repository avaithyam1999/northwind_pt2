package com.pluralsight.ui;

import com.pluralsight.data.CustomerDao;
import com.pluralsight.data.ProductDao;
import com.pluralsight.model.Customer;
import com.pluralsight.model.Product;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerDao customerDao = setAuthentication(args);

        System.out.println("======Northwind======");
        System.out.println("""
                1. View Customers
                2. Search Customers
                3. View Products
                4. Search Products
                5. Quit Program
                """);
        byte choice = scanner.nextByte();
        scanner.nextLine();
        switch (choice) {
            case 1 -> {
                getAllCustomers(customerDao);
            }
            case 2 -> {
                getAllProducts();
            }
        }

    }

    private static void getAllProducts() {
        List<Product> products = ProductDao.getAll();

        System.out.println("======All Customers======");
        for (Product product : products) {
            System.out.println(product.getProductID() + " - " +
                    product.getProductName() + " - " +
                    product.getUnitPrice());
        }
    }

    private static CustomerDao setAuthentication(String[] args) {
        String username = args[0];
        String password = args[1];
        String url = "jdbc:mysql://localhost:3306/Northwind";

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        CustomerDao customerDao = new CustomerDao(dataSource);
        return customerDao;
    }

    private static void getAllCustomers(CustomerDao customerDao) {
        List<Customer> customers = customerDao.getAll();

        System.out.println("======All Customers======");
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerId() + " - " +
                    customer.getCompanyName() + " - " +
                    customer.getContactName());
        }
    }
}
