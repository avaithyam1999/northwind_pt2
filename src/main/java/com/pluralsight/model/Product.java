package com.pluralsight.model;

public class Product {
    private int productID;
    private String productName;
    private int supplierID;
    private int categoryID;
    private String quantityPerUnit;
    private int unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    private int discontinued;

    public Product(int productID, String productName, int supplierID, int categoryID, String quantityPerUnit, int unitPrice, int unitsInStock, int unitsOnOrder, int reorderLevel, int discontinued) {
        this.productID = productID;
        this.productName = productName;
        this.supplierID = supplierID;
        this.categoryID = categoryID;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }


}
